package com.example.demo.service;

import java.util.Random;
import java.util.Timer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.TableTopic;
import com.example.demo.model.TableUser;
import com.example.demo.repository.TableTopicRepository;
import com.example.demo.repository.TableUserRepository;

import dto.InputDataDto;
import java.util.TimerTask;

@Service
public class ServicesImpl implements Services
{
	
	@Autowired
	TableUserRepository tableUserRepository;
	
	@Autowired
	TableTopicRepository tableTopicRepository;
	

	@Override
	public TableUser getUserStatus(Integer userId) {
		return tableUserRepository.findByidtableUserId(userId);
	}

	@Override
	public TableUser updateUserStatus(TableUser tableUser) {
		if(tableUser != null && tableUser.getTableUserActive() == true)
		{
			tableUser.setTableUserActive(false);
		}
		else
		{
			tableUser.setTableUserActive(true);
		}
		return tableUserRepository.save(tableUser);
	}
	
	int deadLine;
	public TableTopic getPdfForTopic(InputDataDto inputDataDto)
	{
		deadLine = 0;
		Timer timer = new Timer();
		TimerTask timerTask = new TimerTask() {
			
			@Override
			public void run() {
				deadLine++;
			}
		};
		timer.scheduleAtFixedRate(timerTask, 1, 300000);
		Random rand = new Random(); 
		Integer rand_int1 = rand.nextInt(1000);
		String key = rand_int1.toString();
		TableUser tableUser = null;
		TableTopic tableTopic = null;
		if(inputDataDto != null)
		{
			tableUser = getUserStatus(inputDataDto.getUserId());
			tableUser.setTableUserKey(key);
			updateUserStatus(tableUser);
			
			tableTopic = tableTopicRepository.findBytableTopicInput(inputDataDto.getTopics());
			
			if(tableTopic == null)
			{
				throw new RuntimeException("No Topic found");
			}
			
			if(tableUser.getTableUserKey().equals(key))
			{
				tableUser.setTableUserKey(null);
				updateUserStatus(tableUser);
				timer.purge();
				return tableTopic;
			}
			else if(!tableUser.getTableUserKey().equals(key))
			{
				return null;
			}
			
		}
		
		return tableTopic;
	}
	
	

}
