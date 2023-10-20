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

import com.health.model.TestCenter;
import com.health.testCenterRepository.TestCenterRepository;



@RestController
@RequestMapping("/")
public class TestCenterController{
	
	@Autowired
	TestCenterRepository testCenterRepository;
	
	@PostMapping("/testCenter")
	public String createNewCenter(@RequestBody TestCenter testCenter) {
		testCenterRepository.save(testCenter);
		return "TestCenter database";
	}
	@GetMapping("/testCenter")
	public ResponseEntity<List<TestCenter>>getAllCenters(){
		List<TestCenter> centerList=new ArrayList<>();
		testCenterRepository.findAll().forEach(centerList::add);
		return new ResponseEntity<List<TestCenter>>(centerList,HttpStatus.OK);
	}
	@GetMapping("/testCenter/{centerId}")
	public ResponseEntity<TestCenter> getCenterById(@PathVariable long centerId){
	 Optional<TestCenter> center= testCenterRepository.findById(centerId);
	 if(center.isPresent()) {
		 return new ResponseEntity<TestCenter>(center.get(),HttpStatus.FOUND);
	 }
	 else {
		 return new ResponseEntity<TestCenter>(HttpStatus.NOT_FOUND);
	 }
	}
	@DeleteMapping("/testCenter/{centerId}")
	public String deleteCenterById(@PathVariable long centerId){
		testCenterRepository.deleteById(centerId);
		return "TestCenter deleted Successfully";
	}
}