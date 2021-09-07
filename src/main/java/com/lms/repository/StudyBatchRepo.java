package com.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.model.StudyBatch;

@Repository
public interface StudyBatchRepo extends JpaRepository<StudyBatch, Long> {

}