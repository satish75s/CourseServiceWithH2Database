package com.h2.service;


import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h2.entity.Course;
import com.h2.repository.CourseRepository;


@Service
public class CourseService {
	
	
	@Autowired
	CourseRepository courseRepository;

	// create course object in DB -> POST
	public Course onboardNewCourse(Course course) {

		//course.setCourseId(new Random().nextInt(3756));
		courseRepository.save(course);
		return course;
	}

	// load all the course from Database // GET
	public List<Course> viewAllCourses() {
		return courseRepository.findAll();
	}

	// filter course by course id //GET
	public Course findByCourseId(Integer courseId) {
		return courseRepository.findAll().stream().filter(course -> course.getCourseId() == courseId).findFirst().orElse(null);
	}

	// delete course //DELETE
	public void deleteCourse(int courseId) {
		Course course = findByCourseId(courseId);
		courseRepository.delete(course);
	}

	// update the course //PUT
	public Course updateCourse(int courseId, Course course) {
		Course existingCourse = findByCourseId(courseId);
		if (existingCourse != null) {
			course.setCourseId(existingCourse.getCourseId());
			courseRepository.save(course);		
			return course;

		}
		return null;
	}
}
