package com.example.manytomanyrelation.department;

import javax.persistence.OneToOne;

public class DepartmentEntity {
    private int departmentId;
    private String departmentName;
    private String departmentGrade;
    @OneToOne(mappedBy = "Name")
    private DepartmentEntity Data;

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
