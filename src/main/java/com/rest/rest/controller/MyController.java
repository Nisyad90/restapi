package com.rest.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.rest.entities.Course;
import com.rest.rest.services.MyServices;

@RestController
public class MyController {
	
	@Autowired
	private MyServices myservice;

	@GetMapping("/home")
	public String home() {
		
		return "this is home";
	}
	
	
	@GetMapping("/apple")
	public String apple() {
		return "this is apple";
	}
	
	
	@GetMapping("/course")
	public List<Course> getCourse(){
		return this.myservice.getCourse();
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.myservice.getCourse(Long.parseLong(courseId));
	}
	
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return this.myservice.addCourse(course);
	}
	
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) {
		return this.myservice.updateCourse(course);
	}
	
	
}


