package com.example.assignment1.entity;
import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private int empId;
    @Column(name = "emp_name")
    private String empName;
    @Column(name = "emp_email")
    private String empEmail;
    @Column(name = "emp_salary")
    private float empSalary;
    /**************One to many relationship***************************************/
    @OneToMany(targetEntity =PhoneNo.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "emp_id")
    private List<PhoneNo> phoneNo; // Phone no list
    public List<PhoneNo> getPhoneNo() {
        return phoneNo;
    }// getter for phoneNo list
    public void setPhoneNo(List<PhoneNo> phoneNo) {
        this.phoneNo = phoneNo;
    }// setter for phoneNo list
    /*****************one to many relationship**************************************/
    // constructor with argument
    public Employee(int empId, String empName, String empEmail, float empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empEmail = empEmail;
        this.empSalary = empSalary;
    }
    // constructor with no argument
    public Employee() {
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
