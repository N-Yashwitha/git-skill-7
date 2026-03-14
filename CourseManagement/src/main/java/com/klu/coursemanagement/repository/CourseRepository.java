package com.klu.coursemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klu.coursemanagement.model.Course;

import java.util.List;
public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByTitleContainingIgnoreCase(String title);
}
