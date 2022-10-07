package com.ssc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ssc.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
