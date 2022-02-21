package com.example.manytomanyrelation.Students;

import com.example.manytomanyrelation.subjects.SubEntity;
import com.example.manytomanyrelation.subjects.SubRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RestController
public class StdController {

    // Subject Service class object
    private final StdService stdObject;
    private final StdRepository stdRepo;
    private final SubRepository subRepo;

    public StdController(StdService stdObject, StdRepository stdRepo, SubRepository subRepo) {
        this.stdObject = stdObject;
        this.stdRepo = stdRepo;
        this.subRepo = subRepo;
    }

    // Repository class object;


    // GetMapping
    @GetMapping("/getData")
    public List<StdEntity> getData() {
        return stdObject.getData();
    }

    //PostMapping
    @PostMapping("/saveData")
    public StdEntity saveData(@RequestBody StdEntity student){
        return stdObject.saveData(student);
    }

    //PutMapping
//    @PutMapping("/{Student_Id}/student/{Subject_Id}")
//    public SubEntity updateData(@RequestBody @PathVariable int Student_Id, @PathVariable int Subject_Id){
//       // return stdObject.updateData(student,Id);
//        StdEntity student =stdRepo.getOne(Student_Id);
//        SubEntity subject =subRepo.getOne(Subject_Id);
//        subject.enrollement(student);
//        return subRepo.save(subject);
//    }


}
