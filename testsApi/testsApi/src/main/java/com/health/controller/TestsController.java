package com.health.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.health.model.Tests;
import com.health.testsRepository.TestsRepository;

@RestController
@RequestMapping("/")
public class TestsController {
	
	@Autowired
	TestsRepository testsRepository;
	
	@PostMapping("/tests")
	public String addTests(@RequestBody Tests tests) {
		testsRepository.save(tests);
		return "test added";
	}
	
	@GetMapping("/tests")
	public ResponseEntity<List<Tests>>getAllTests(){
		List<Tests> testList=new ArrayList<>();
		testsRepository.findAll().forEach(testList::add);
		return new ResponseEntity<List<Tests>>(testList,HttpStatus.OK);
	}
	
	@GetMapping("/tests/{testsId}")
	public ResponseEntity<Tests>getTestById(@PathVariable long testsId){
		Optional<Tests> test=testsRepository.findById(testsId);
		if(test.isPresent()) {
			return new ResponseEntity<Tests>(test.get(),HttpStatus.OK);
		}
		else {
			return new ResponseEntity<Tests>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/tests/{testsId}")
	public String deleteTestById(@PathVariable long testsId) {
		testsRepository.deleteById(testsId);
		return "Test removed";
	}
	
}
