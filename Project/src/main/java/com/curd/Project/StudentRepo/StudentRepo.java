package com.curd.Project.StudentRepo;

import com.curd.Project.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
