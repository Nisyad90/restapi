package com.rest.rest.services;

import java.util.List;
import java.util.Optional;

import com.rest.rest.entities.Course;

public interface MyServices {
	
	public List<Course> getCourse(); 
	
	public Optional getCourse(long courseId); 
	
	public Course addCourse(Course course);

	public Course updateCourse(Course course);
	
	public Optional deleteCourse(long parseLong);

}
