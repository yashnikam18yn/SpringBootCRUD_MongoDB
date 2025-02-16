//package com.projectk.simpleApp.controller;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.projectk.simpleApp.entity.SimpleEntry;
//
//@RestController
//@RequestMapping("/projectk")
//public class SimpleEntryController {
//	
//	private Map<Integer,SimpleEntry> simpleEntries = new HashMap<>();
//	
//	
//	@GetMapping("/list-all")
//	public List<SimpleEntry> getAll(){
//		return new ArrayList<>(simpleEntries.values());
//	}
//	
//	@PostMapping
//	public boolean createEntry(@RequestBody SimpleEntry myentry) {
//		simpleEntries.put(myentry.getId(), myentry);
//		return true;
//	}
//	
//	@GetMapping("id/{myid}")
//	public SimpleEntry getById(@PathVariable Integer myid) {
//		return simpleEntries.get(myid);
//	}
//	
//	
//	@DeleteMapping("id/{myid}")
//	public SimpleEntry deleteById(@PathVariable Integer myid) {
//		return simpleEntries.remove(myid);
//	}
//	
//	@PutMapping("/id/{myid}")
//	public SimpleEntry updateById(@PathVariable Integer myid,@RequestBody SimpleEntry myentry) {
//		return simpleEntries.put(myid, myentry);
//	}
//}
