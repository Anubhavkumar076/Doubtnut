package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.TableUser;

@Repository
public interface TableUserRepository extends CrudRepository<TableUser,Integer>{
	
	public TableUser findByidtableUserId(Integer userId);
	
	public TableUser save(TableUser tableUser);

}
