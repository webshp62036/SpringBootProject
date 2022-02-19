package com.example.crudeoperation.entity;
import javax.persistence.*;

@Entity
public class DeptEntity{


    // Fields declaration
       @Id
       @GeneratedValue(strategy = GenerationType.AUTO)
       private int deptId;
       private String deptName;
       private String deptFee;
       private char deptGrade;

    public DeptEntity(int deptId, String deptName, String deptFee, char deptGrade) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.deptFee = deptFee;
        this.deptGrade = deptGrade;
    }

    // Non parameterize constructors
    public DeptEntity() {

    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptFee() {
        return deptFee;
    }

    public void setDeptFee(String deptFee) {
        this.deptFee = deptFee;
    }

    public char getDeptGrade() {
        return deptGrade;
    }

    public void setDeptGrade(char deptGrade) {
        this.deptGrade = deptGrade;
    }


}
