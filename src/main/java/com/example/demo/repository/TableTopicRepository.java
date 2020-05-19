package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.TableTopic;

@Repository
public interface TableTopicRepository extends CrudRepository<TableTopic,Integer>
{
	public TableTopic findBytableTopicInput(String tableTopicInput);
}
