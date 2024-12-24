package com.h2.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.h2.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

	Course findByCourseId(Integer courseId);

}
