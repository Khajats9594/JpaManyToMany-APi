package com.testvagrant.repository;

import com.testvagrant.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course,Long> {

    List<Course> findByFeeLessThan(double fee);
}
