package com.projectk.simpleApp.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projectk.simpleApp.Respository.SimpleEntryRepo;
import com.projectk.simpleApp.entity.SimpleEntry;

@Component
public class SimpleEntryService {

	@Autowired
	private SimpleEntryRepo simpleEntryRepo;
	
	public void saveEntry(SimpleEntry simpleEntry) {
		simpleEntryRepo.save(simpleEntry);
	}
	
	public List<SimpleEntry> getAll(){
		return simpleEntryRepo.findAll();
	}
	
	public void deleteById(String id) {
		simpleEntryRepo.deleteById(id);
	}
	
	public Optional<SimpleEntry> findById(String id) {
		return simpleEntryRepo.findById(id);
	}
	
}
