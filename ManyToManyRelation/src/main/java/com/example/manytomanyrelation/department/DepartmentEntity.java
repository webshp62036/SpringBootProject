package com.example.manytomanyrelation.department;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
public class DepartmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int departmentId;
    @Column(name ="department_name")
    private String departmentName;
    private String departmentGrade;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "department")
    private ArrayList<Entity> teacher = new ArrayList<>();



    public DepartmentEntity(int departmentId, String departmentName, String departmentGrade) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentGrade = departmentGrade;
    }
    public DepartmentEntity(){
        super();
    }
    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentGrade() {
        return departmentGrade;
    }

    public void setDepartmentGrade(String departmentGrade) {
        this.departmentGrade = departmentGrade;
    }


}
