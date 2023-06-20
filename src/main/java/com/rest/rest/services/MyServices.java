package com.rest.rest.services;

import java.util.List;

import com.rest.rest.entities.Course;

public interface MyServices {
	
	public List<Course> getCourse(); 
	
	public Course getCourse(long courseId); 
	
	public Course addCourse(Course course);

	public Course updateCourse(Course course);
	
	public void deleteCourse(long parseLong);

}
