package com.example.onetomany.service;

import com.example.onetomany.entity.StudentEntity;
import com.example.onetomany.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public String saveStudentData(StudentEntity student) {
        studentRepository.save(student);
        return "Data Successfully Saved !!!!!!!!!!";
    }

    public List<StudentEntity> getStudentData() {
        return studentRepository.findAll();
    }

    public String updateStudentData(StudentEntity student, int studentId) {
        StudentEntity obj = studentRepository.findById(studentId).get();
        obj.setStudentName(student.getStudentName());
        obj.setStudentRoll(student.getStudentRoll());
        obj.setStudentCity(student.getStudentCity());
        studentRepository.save(obj);
        return "Data Successfully Updated With Id" + studentId;
    }

}