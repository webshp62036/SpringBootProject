package com.example.assignment1.controller;

import com.example.assignment1.dto.EmployeeDto;
import com.example.assignment1.entity.Employee;
import com.example.assignment1.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.ManyToOne;
import java.util.List;
@Controller
@RestController
public class EmpController {

    private final EmployeeService employeeService;

    public EmpController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    // postMapping
    @PostMapping("save/employee/data")
    public String save(@RequestBody EmployeeDto employeeDto){
        return employeeService.saveEmpData(employeeDto);

    }
    @GetMapping("get/employee/data")
    public List<Employee> getData(){
        return employeeService.getEmpData();
    }
    @PutMapping("update/employee/data/{empId}")
    public String updateData(@RequestBody EmployeeDto employeeDto, @PathVariable int empId){
        return employeeService.updateEmpData(employeeDto,empId);
    }

    @DeleteMapping("delete/employee/data/{empId}")
    public String  deleteData(@PathVariable int empId){
        return employeeService.deleteEmpData(empId);
    }


}
