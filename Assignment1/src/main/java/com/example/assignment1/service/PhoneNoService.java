package com.example.assignment1.service;

import com.example.assignment1.entity.PhoneNo;
import com.example.assignment1.repository.PhoneNoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PhoneNoService {
   private final PhoneNoRepository phoneNoRepository;

    public PhoneNoService(PhoneNoRepository phoneNoRepository) {
        this.phoneNoRepository = phoneNoRepository;
    }

    public String savePhoData(PhoneNo phoneNo){
        phoneNoRepository.save(phoneNo);
        return "Data Successfully Save !!!!!!!!!";
    }

    public List<PhoneNo> getPhoData() {
        return phoneNoRepository.findAll();
    }

    public String updatePhoData(PhoneNo phoneNo, int pId) {
        PhoneNo obj =phoneNoRepository.findById(pId).get();
        obj.setPhoneNo(phoneNo.getPhoneNo());
        obj.setZipCode(phoneNo.getZipCode());
        phoneNoRepository.save(obj);
        return "Data Successfully updated !!!!!!!";
    }

    public String deletePhoData(int pId) {
        phoneNoRepository.deleteById(pId);
        return "Data Successfully Deleted With Id"+pId;

    }
}
