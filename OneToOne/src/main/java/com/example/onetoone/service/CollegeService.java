package com.example.onetoone.service;

import com.example.onetoone.Entity.CollegeEntity;
import com.example.onetoone.repository.CollegeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeService {
    private final CollegeRepository collegeRepository;

    public CollegeService(CollegeRepository collegeRepository) {
        this.collegeRepository = collegeRepository;
    }

    public CollegeEntity saveCollegeData(CollegeEntity college) {
       return collegeRepository.save(college);
    }

    public List<CollegeEntity> getCollegeData() {
        return collegeRepository.findAll();
    }

    public String updateCollegeData(CollegeEntity college ,int collegeId) {
        CollegeEntity obj = collegeRepository.findById(collegeId).get();
        obj.setCollegeName(college.getCollegeName());
        obj.setCollegeCity(college.getCollegeCity());
        collegeRepository.save(obj);
        return "data succefully updated with id="+collegeId;
    }
}
