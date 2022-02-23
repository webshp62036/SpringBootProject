package com.example.onetoone.controller;


import com.example.onetoone.Entity.UniversityEntity;
import com.example.onetoone.service.UniversityService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class UniversityController {

    private final UniversityService universityService;

    public UniversityController(UniversityService universityService) {
        this.universityService = universityService;
    }

    // putmapping
    @PostMapping("saveUniversityData")
    public String save(@RequestBody UniversityEntity university){
        return universityService.saveUniversityData(university);
    }

    //Getting Data
    @GetMapping("getUniversityData")
    public List<UniversityEntity> getter(){
        return universityService.getUniversityData();
    }

    // putting data// update existing data

    @PutMapping("updateUniversityData/{universityId}")
    public String update(@RequestBody UniversityEntity university,@PathVariable int universityId){
        return universityService.updateUniversityData(university, universityId);
    }



}
