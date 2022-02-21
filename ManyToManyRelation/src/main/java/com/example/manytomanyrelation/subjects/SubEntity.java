package com.example.manytomanyrelation.subjects;

import com.example.manytomanyrelation.Students.StdEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class SubEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Subject_Id;
    private String SubjectName;
    private String SubjectTimeDuration;

     //Here we are trying to mapped the tables
    @ManyToMany(mappedBy ="Subject")
    private final Set<StdEntity> studentData = new HashSet<>();

    public SubEntity(int id, String subjectName, String subjectTimeDuration) {
        Subject_Id = id;
        SubjectName = subjectName;
        SubjectTimeDuration = subjectTimeDuration;
    }
    public SubEntity(){
        super();
    }
    public int getId() {
        return Subject_Id;
    }

    public void setId(int id) {
        Subject_Id = id;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String subjectName) {
        SubjectName = subjectName;
    }

    public String getSubjectTimeDuration() {
        return SubjectTimeDuration;
    }

    public void setSubjectTimeDuration(String subjectTimeDuration) {
        SubjectTimeDuration = subjectTimeDuration;
    }
    public void enrollement(StdEntity student){
        studentData.add(student);
    }
}
