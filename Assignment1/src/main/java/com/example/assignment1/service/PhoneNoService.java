package com.example.assignment1.service;

import com.example.assignment1.dto.PhoneDto;
import com.example.assignment1.entity.PhoneNo;
import com.example.assignment1.repository.PhoneNoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PhoneNoService {
    String message;
   private final PhoneNoRepository phoneNoRepository;
   public PhoneNoService(PhoneNoRepository phoneNoRepository) {
        this.phoneNoRepository = phoneNoRepository;
    }

    // Method for saving data into repository or database;
    public String savePhoData(PhoneDto phoneDto){
       if(phoneDto !=null) {
           PhoneNo phoneData = new PhoneNo();
           phoneData.setPhoneNo(phoneDto.getPhoneNo());
           phoneData.setZipCode(phoneDto.getZipCode());
           phoneNoRepository.save((phoneData));
           message = "Data Successfully Save !!!!!!!!!";
       }
       else
       {
           message="Please Enter Proper Data....Try Again!!!";
       }
       return message;
    }
   // Method For Fetching data from repository
    public List<PhoneNo> getPhoData() {
        return phoneNoRepository.findAll();
    }
    // Method for updating existing data
    public String updatePhoData(PhoneDto phoneDto, int pId) {
       message=null;
        if(phoneNoRepository.existsById(pId)){
            PhoneNo obj =phoneNoRepository.findById(pId).get();
            obj.setPhoneNo(phoneDto.getPhoneNo());
            obj.setZipCode(phoneDto.getZipCode());
            phoneNoRepository.save(obj);
            message="Data Successfully updated !!!!!!!";
        }
        else
            message="You have entered wrong Id ?? Try Again !!!!!";
        return message;
    }
   // Method For Deleting the existing data
    public String deletePhoData(int pId) {
        message = null;
        if (phoneNoRepository.existsById(pId)) {
            phoneNoRepository.deleteById(pId);
            message = "Data Successfully Deleted With Id" + pId;
        } else
            message = "you have entered wrong details ?? ....!!!!!!";
        return message;
    }
}
