package com.example.manytomanyrelation.Students;

import com.example.manytomanyrelation.subjects.SubEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class StdEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Student_Id;
    private String Name;
    private long RollNo;
    private String City;

  // Many to Many Relationship
    @ManyToMany
    @JoinTable(
              name="Enrollment_Table",
              joinColumns =@JoinColumn( name ="Subject_Id"),
              inverseJoinColumns=@JoinColumn( name ="Student_Id")
    )
    private List<SubEntity> enrollement=new ArrayList<>();



    public StdEntity(int id, String name, long rollNo, String city) {
       Student_Id = id;
        Name = name;
        RollNo = rollNo;
        City = city;
    }
    // non parameterized constructor
    public StdEntity(){
        super();
    }


    public int getId() {
        return Student_Id;
    }

    public void setId(int id) {
        Student_Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getRollNo() {
        return RollNo;
    }

    public void setRollNo(long rollNo) {
        RollNo = rollNo;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }



}
