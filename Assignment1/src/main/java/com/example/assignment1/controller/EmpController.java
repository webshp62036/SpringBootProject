package com.example.assignment1.controller;

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
    @PostMapping("saveEmpData")
    public String save(@RequestBody Employee empolyee){
        return employeeService.saveEmpData(empolyee);

    }
    @GetMapping("getEmpData")
    public List<Employee> getData(){
        return employeeService.getEmpData();
    }
    @PutMapping("updateEmpData")
    public String updateData(@RequestBody Employee empolyee, @PathVariable int empId){
        return employeeService.updateEmpData(empolyee,empId);
    }

    @DeleteMapping("deleteEmpData")
    public String  deleteData(@PathVariable int empId){
        return employeeService.deleteEmpData(empId);
    }


}
