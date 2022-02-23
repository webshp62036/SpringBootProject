package com.example.onetoone.controller;

import com.example.onetoone.Entity.CollegeEntity;
import com.example.onetoone.service.CollegeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class CollegeController {
    private final CollegeService collegeService;

    public CollegeController(CollegeService collegeService) {
        this.collegeService = collegeService;
    }

    // putmapping
    @PostMapping("saveCollegeData")
    public CollegeEntity save(@RequestBody CollegeEntity college){
        return collegeService.saveCollegeData(college);
    }

    //Getting Data
    @GetMapping("getCollegeData")
    public List<CollegeEntity>getter(){
        return collegeService.getCollegeData();
    }

    // putting data// update existing data

    @PutMapping("updateCollegeData/{collegeId}")
    public String update(@RequestBody CollegeEntity college,@PathVariable int collegeId){
        return collegeService.updateCollegeData(college, collegeId);
    }


}
