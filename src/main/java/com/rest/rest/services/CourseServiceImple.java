package com.rest.rest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.rest.dao.CourseDao;
import com.rest.rest.entities.Course;

@Service
public class CourseServiceImple implements MyServices {

	@Autowired
	private CourseDao courseDao;
	@Override
	public List<Course> getCourse() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}
	@Override
	public Optional getCourse(long courseId) {
		// TODO Auto-generated method stub
		return courseDao.findById(courseId);
	}
	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		courseDao.save(course);
		return course;
	}
	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		courseDao.save(course);
		return course;
	}
	@Override
	public Optional deleteCourse(long parseLong) {
		// TODO Auto-generated method stub
		return courseDao.findById(parseLong);
		
		
	}
	
	

}
