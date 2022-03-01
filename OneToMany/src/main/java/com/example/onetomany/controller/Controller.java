package com.example.onetomany.controller;

import com.example.onetomany.entity.StudentEntity;
import com.example.onetomany.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@Controller
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    // postmapping()
    @PostMapping("saveStudentData")
    public String saveData(@RequestBody StudentEntity student){
        return studentService.saveStudentData(student);
    }
    @GetMapping("getStudentData")
    public List<StudentEntity> getData(){
        return studentService.getStudentData();
    }
    @PutMapping("updateStudentData/{studentId}")
    public String updateData(@RequestBody StudentEntity student, @PathVariable int studentId){
        return studentService.updateStudentData(student,studentId);
    }
}