package com.example.manytomanyrelation.Students;

import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import java.util.List;
@Service
public class StdService {

    // Repository class object
    private final StdRepository stdObject;

    public StdService(StdRepository stdObject) {
        this.stdObject = stdObject;
    }

    // getData()
    public List<StdEntity> getData() {
        return stdObject.findAll();
    }

    // saveData()
    public StdEntity saveData(StdEntity student) {
        return stdObject.save(student);
    }

    public String updateData(StdEntity student ,int id) {
        StdEntity obj =stdObject.findById(id).get();
        obj.setName(student.getName());
        obj.setRollNo(student.getRollNo());
        obj.setCity(student.getCity());
        stdObject.save(obj);
        return " data successfully updated of id"+id;
    }

}
