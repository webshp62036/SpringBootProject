package com.example.manytomanyrelation.subjects;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RestController
public class SubController {

    // Object of subject service class
    private  final SubService serObject;

    public SubController(SubService serObject) {
        this.serObject = serObject;
    }

    // Postmapping
    @PostMapping("/saveSubjectData")
    public String saveData(@RequestBody SubEntity subject) {
        return serObject.saveSubjectData(subject);
    }


    // GetMapping
    @GetMapping("/getSubjectData")
    public List<SubEntity> getData(){
        return serObject.getSubjectData();
    }

    // Putmapping
    @PutMapping("/updateSubjectData/{Id}")
    public String updateData(@RequestBody SubEntity subject, @PathVariable int Id){
        return serObject.updateSubjectData(subject,Id);
    }

}
