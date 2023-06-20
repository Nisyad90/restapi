package com.rest.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.rest.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long> {
	
	

}
