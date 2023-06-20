package com.rest.rest.services;

import java.util.List;

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
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		return courseDao.getOne(courseId);
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
	public void deleteCourse(long parseLong) {
		// TODO Auto-generated method stub
		Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
		
	}
	
	

}
