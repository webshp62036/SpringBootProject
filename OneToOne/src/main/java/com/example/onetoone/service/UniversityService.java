package com.example.onetoone.service;

import com.example.onetoone.Entity.UniversityEntity;
import com.example.onetoone.repository.UniversityRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UniversityService {
    private final UniversityRepository universityRepository;


    public UniversityService(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    public String saveUniversityData(UniversityEntity university) {
         universityRepository.save(university);
         return "University Data Successfully Save !!!";
    }

    public List<UniversityEntity> getUniversityData() {
        return universityRepository.findAll();
    }

    public String updateUniversityData(UniversityEntity university, int universityId) {
        UniversityEntity obj = universityRepository.findById(universityId).get();
        obj.setUniversityName(university.getUniversityName());
        obj.setUniversityCity(university.getUniversityCity());
        universityRepository.save(obj);
        return "University Data Succefully Updated With Id="+universityId;

    }
}
