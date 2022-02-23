package com.example.onetomany.service;

import com.example.onetomany.entity.SubjectEntity;
import com.example.onetomany.repository.SubjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SubjectService {
    private final SubjectRepository subjectRepository;

    public SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }


    public String saveSubjectData(SubjectEntity subject){
        subjectRepository.save(subject);
        return "Subject Data Succefully Saved!!!!!";
    }
    public List<SubjectEntity> getSubjectData(){
        return subjectRepository.findAll();
    }
    public String updateSubjectData(SubjectEntity subject,int subjectId){
        SubjectEntity obj = subjectRepository.findById(subjectId).get();
        obj.setSubjectName(subject.getSubjectName());
        obj.setSubjectFee(subject.getSubjectFee());
        subjectRepository.save(obj);
        return "Data Successfully Updated With Id"+subjectId;
    }


}