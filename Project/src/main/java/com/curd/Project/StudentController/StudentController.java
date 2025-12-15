package com.curd.Project.StudentController;

import com.curd.Project.StudentRepo.StudentRepo;
import com.curd.Project.model.Student;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
StudentRepo repo ;

    @GetMapping("/student")
    public List<Student> getAllStudents(){
   List <Student> list=repo.findAll();
        return list;
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable int id){
        Student student= repo.findById(id).get();
        return student;
    }
    @DeleteMapping("/delete/{id}")
    public void deleteStudentById(@PathVariable int id){
        Student student= repo.findById(id).get();
        repo.delete(student);
    }

    @PostMapping("/create")
    public void createStudent(@RequestBody Student student){
        repo.save(student);
    }
}
