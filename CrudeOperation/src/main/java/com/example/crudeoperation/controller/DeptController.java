package com.example.crudeoperation.controller;


import com.example.crudeoperation.entity.DeptEntity;
import com.example.crudeoperation.service.DeptService;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("*")

public class DeptController {
   private final DeptService serviceObj;

    public DeptController(DeptService serviceObj) {
        this.serviceObj = serviceObj;
    }

    // call all crud methods one by one
    @PostMapping("saveData")
    public DeptEntity saveDeptInfo(@RequestBody DeptEntity Department) {
        System.out.println("Department data save successfully");
        return serviceObj.saveDeptInfo(Department);
    }
    //update data with putMapping
    @PutMapping(value = "updateData")
    public DeptEntity updateDeptInfo(@RequestBody DeptEntity Department){
        return serviceObj.updateDeptInfo(Department);
    }
    // findAll Data with GetMapping
    @GetMapping(value = "findAllData")
    public List<DeptEntity> findAllDeptInfo(){
        return serviceObj.findAllDeptInfo();
    }
    // Delete data using Delete
    @DeleteMapping("deleteData/{id}")
    public String deleteDeptInfo(@PathVariable("id") Integer deptId){

        serviceObj.deleteDeptInfo(deptId);
        return "Deleted data Successfully !!!";
    }

}
