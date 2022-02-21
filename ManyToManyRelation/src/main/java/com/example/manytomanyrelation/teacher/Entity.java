package com.example.manytomanyrelation.teacher;

import javax.persistence.*;
import java.util.List;

public class Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String Name;
    private float Fee;
    private String City;
    @OneToOne
    @JoinTable(name = "TeacherEnrollment",
            joinColumns = @JoinColumn(name ="Name"),
            inverseJoinColumns = @JoinColumn(name = "departmentName")

    )
    private Entity teacher;

    public Entity(int id, String name, float fee, String city) {
        Id = id;
        Name = name;
        Fee = fee;
        City = city;
    }
    public Entity(){
        super();
    }
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public float getFee() {
        return Fee;
    }

    public void setFee(float fee) {
        Fee = fee;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }


}
