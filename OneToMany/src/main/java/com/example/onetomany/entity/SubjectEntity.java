package com.example.onetomany.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class SubjectEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int subjectId;
    private String subjectName;
    private float subjectFee;

    public SubjectEntity(int subjectId, String subjectName, float subjectFee) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.subjectFee = subjectFee;
    }

    public SubjectEntity() {

    }


    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public float getSubjectFee() {
        return subjectFee;
    }

    public void setSubjectFee(float subjectFee) {
        this.subjectFee = subjectFee;
    }



}