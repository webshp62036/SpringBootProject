package com.example.onetomany.service;

import com.example.onetomany.entity.StudentEntity;
import com.example.onetomany.repository.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    private final Repository studentRepository;

    public StudentService(Repository studentRepository) {
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