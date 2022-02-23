package com.example.onetomany.controller;

import com.example.onetomany.entity.SubjectEntity;
import com.example.onetomany.service.SubjectService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RestController
public class SubjectController {

    private final SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }


    // postmapping
    @PostMapping("saveSubjectDetails")
    public String saveData(@RequestBody SubjectEntity subject){
        return subjectService.saveSubjectData(subject);
    }
    // getting data
    @GetMapping("getSubjectData")
    public List<SubjectEntity> getData(){
        return subjectService.getSubjectData();
    }
    // Putting Data
    @PutMapping("updateSubjectData/{subjectId}")
    public String updateData(@RequestBody SubjectEntity subject, @PathVariable int subjectId){
        return subjectService.updateSubjectData(subject,subjectId);
    }

}