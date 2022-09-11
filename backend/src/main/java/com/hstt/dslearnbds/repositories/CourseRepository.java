package com.hstt.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hstt.dslearnbds.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
