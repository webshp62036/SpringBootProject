package com.example.assignment1.service;
import com.example.assignment1.dto.EmployeeDto;
import com.example.assignment1.entity.Employee;
import com.example.assignment1.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {
    String message;
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    // save a particular class data
    public String saveEmpData(EmployeeDto employeeDto){
        message=null;
        if(employeeDto !=null) {
            Employee obj = new Employee();
            obj.setEmpName(employeeDto.getEmpName());
            obj.setEmpEmail(employeeDto.getEmpEmail());
            obj.setEmpId(employeeDto.getEmpId());
            obj.setEmpSalary(employeeDto.getEmpSalary());
            employeeRepository.save(obj);
            message = "Data Successfully Save !!!!!!!!!";
        }
        else
            message="You have empty data please fill it";
        return message;
    }
    // Method for getting all existing data
    public List<Employee> getEmpData() {
        return employeeRepository.findAll();
    }
    // Method for updating data
    public String updateEmpData(EmployeeDto employeeDto, int empId) {
         message=null;
        if(employeeRepository.existsById(empId)) {
            Employee update =employeeRepository.findById(empId).get();
            update.setEmpName(employeeDto.getEmpName());
            update.setEmpEmail(employeeDto.getEmpEmail());
            update.setEmpSalary(employeeDto.getEmpSalary());
            employeeRepository.save(update);
            message= "Data Successfully updated !!!!!!!";
        }
        else
        {
         message="You Have Entered Wrong ID ?? Try Again..."  ;
        }
        return message;
    }
  // method for deleting any particular data from repository or database
    public String deleteEmpData(int empId) {
         message = null;
        if (employeeRepository.existsById(empId)) {
            employeeRepository.deleteById(empId);
            message = "Data Successfully Deleted With Id" + empId;
        } else {
            message = "You Have Entered Wrong Data ?? Try Again !!";
        }
        return message;
    }
}
