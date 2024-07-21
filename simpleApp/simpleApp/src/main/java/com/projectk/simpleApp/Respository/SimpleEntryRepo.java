package com.projectk.simpleApp.Respository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.projectk.simpleApp.entity.SimpleEntry;

public interface SimpleEntryRepo extends MongoRepository<SimpleEntry, String>{
	
}
