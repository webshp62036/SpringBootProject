package com.example.onetomany.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;
    private long studentRoll;
    private String studentName;
    @OneToMany(targetEntity = SubjectEntity.class)
    private List<SubjectEntity> subjectEntityList;

    public StudentEntity(int studentId, long studentRoll, String studentName, String studentCity) {
        this.studentId = studentId;
        this.studentRoll = studentRoll;
        this.studentName = studentName;
        this.studentCity = studentCity;
    }
    public StudentEntity(){
        super();
    }
    private String studentCity;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public long getStudentRoll() {
        return studentRoll;
    }

    public void setStudentRoll(long studentRoll) {
        this.studentRoll = studentRoll;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }


}