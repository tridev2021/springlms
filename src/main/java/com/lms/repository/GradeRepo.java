package com.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.model.Grade;

@Repository
public interface GradeRepo extends JpaRepository<Grade, Long> {

}