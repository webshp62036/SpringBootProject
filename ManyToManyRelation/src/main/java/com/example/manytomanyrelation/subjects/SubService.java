package com.example.manytomanyrelation.subjects;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SubService {
    // object of reposiroy class
    private final SubRepository repoObject;

    public SubService(SubRepository repoObject) {
        this.repoObject = repoObject;
    }

    public String saveSubjectData(SubEntity subject) {
        repoObject.save(subject);
        return "Data Successfully saved!!!!!!!!";

    }

    public List<SubEntity> getSubjectData() {
       return repoObject.findAll();
    }


    public String updateSubjectData(SubEntity subject, int id) {
        SubEntity obj =repoObject.findById(id).get();
        obj.setSubjectName(subject.getSubjectName());
        obj.setSubjectTimeDuration(subject.getSubjectTimeDuration());
        repoObject.save(obj);
        return " data successfully updated of id"+id;
    }
}
