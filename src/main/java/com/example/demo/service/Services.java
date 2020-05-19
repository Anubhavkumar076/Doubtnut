package com.example.demo.service;

import com.example.demo.model.TableTopic;
import com.example.demo.model.TableUser;

import dto.InputDataDto;

public interface Services  {

	TableUser getUserStatus(Integer userId);
	
	TableUser updateUserStatus(TableUser tableUser);
	
	public TableTopic getPdfForTopic(InputDataDto inputDataDto);
	
	
}