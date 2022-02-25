package com.example.assignment1.controller;

import com.example.assignment1.entity.PhoneNo;
import com.example.assignment1.service.PhoneNoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RestController
public class PhController {
    private  final PhoneNoService phoneNoService;

    public PhController(PhoneNoService phoneNoService) {
        this.phoneNoService = phoneNoService;
    }

    // postMapping
    @PostMapping("savePhoData")
    public String save(@RequestBody PhoneNo phoneNo){
        return phoneNoService.savePhoData(phoneNo);

    }
    @GetMapping("getPhoData")
    public List<PhoneNo> getData(){
        return phoneNoService.getPhoData();
    }
    @PutMapping("updatePhoData")
    public String updateData(@RequestBody PhoneNo phoneNo, @PathVariable int pId){
        return phoneNoService.updatePhoData(phoneNo,pId);
    }

    @DeleteMapping("deletePhoData")
    public String  deleteData(@PathVariable int pId){
        return phoneNoService.deletePhoData(pId);
    }
}
