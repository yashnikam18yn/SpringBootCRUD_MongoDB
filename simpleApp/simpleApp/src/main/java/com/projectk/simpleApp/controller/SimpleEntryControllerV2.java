package com.projectk.simpleApp.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectk.simpleApp.Services.SimpleEntryService;
import com.projectk.simpleApp.entity.SimpleEntry;

@RestController
@RequestMapping("/project")
public class SimpleEntryControllerV2 {
	

	
	@Autowired
	private SimpleEntryService simpleEntryService;
	
	@GetMapping("/list-all")
	public List<SimpleEntry> getAll(){
		return simpleEntryService.getAll();
	}
	
	@PostMapping
	public boolean createEntry(@RequestBody SimpleEntry myentry) {
		simpleEntryService.saveEntry(myentry);
		return true;
	}
	
	@GetMapping("id/{myid}")
	public SimpleEntry getById(@PathVariable Integer myid) {
		return null;
	}
	
	
	@DeleteMapping("/id/{myid}")
	public boolean deleteById(@PathVariable String myid) {
		simpleEntryService.deleteById(myid);
		return true;
	}
	
	@PutMapping("/id/{myid}")
	public SimpleEntry updateById(@PathVariable String myid,@RequestBody SimpleEntry myentry) {
		Optional<SimpleEntry> old=Optional.ofNullable(simpleEntryService.findById(myid).orElse(null));
		
		simpleEntryService.saveEntry(myentry);
		return myentry;
	}
}
