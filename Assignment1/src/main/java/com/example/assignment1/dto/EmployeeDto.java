package com.example.assignment1.dto;
public class EmployeeDto {
     private int empId;
     private String empName;
     private String empEmail;
     private float empSalary;
    // constructor with argument
    public EmployeeDto(int empId, String empName, String empEmail, float empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empEmail = empEmail;
        this.empSalary = empSalary;
    }
    // constructor with no argument

    public EmployeeDto() {
    }

    // Getter and Setter for all above declared fields
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public float getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(float empSalary) {
        this.empSalary = empSalary;
    }
}
