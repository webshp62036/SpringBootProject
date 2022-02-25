package com.example.assignment1.service;

import com.example.assignment1.entity.Employee;
import com.example.assignment1.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    public String saveEmpData(Employee empolyee){
        employeeRepository.save(empolyee);
        return "Data Successfully Save !!!!!!!!!";
    }

    public List<Employee> getEmpData() {
        return employeeRepository.findAll();
    }

    public String updateEmpData(Employee empolyee, int empId) {
        Employee obj =employeeRepository.findById(empId).get();
        obj.setEmpName(empolyee.getEmpName());
        obj.setEmpEmail(empolyee.getEmpEmail());
        obj.setEmpSalary(empolyee.getEmpSalary());
        employeeRepository.save(obj);
        return "Data Successfully updated !!!!!!!";
    }

    public String deleteEmpData(int empId) {
         employeeRepository.deleteById(empId);
         return "Data Successfully Deleted With Id"+empId;

    }
}
