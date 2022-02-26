package com.example.assignment1.controller;

import com.example.assignment1.dto.PhoneDto;
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
    @PostMapping("save/phone/data")
    public String save(@RequestBody PhoneDto phoneDto){
        return phoneNoService.savePhoData(phoneDto);

    }
    @GetMapping("get/phone/data")
    public List<PhoneNo> getData(){
        return phoneNoService.getPhoData();
    }
    @PutMapping("update/phone/data/{pId}")
    public String updateData(@RequestBody PhoneDto phoneDto, @PathVariable int pId){
        return phoneNoService.updatePhoData(phoneDto,pId);
    }

    @DeleteMapping("delete/phone/data/{pId}")
    public String  deleteData(@PathVariable int pId){
        return phoneNoService.deletePhoData(pId);
    }
}
