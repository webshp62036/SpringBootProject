package com.example.manytomanyrelation.teacher;

import com.example.manytomanyrelation.department.DepartmentEntity;

import javax.persistence.*;
@javax.persistence.Entity
public class Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int teacherId;
    @Column(name = "teacher_name")
    private String Name;
    private float Fee;
    private String City;
    @ManyToOne(fetch = FetchType.EAGER,cascade =CascadeType.PERSIST)
    @JoinTable(name = "Department_Teacher",
              joinColumns = @JoinColumn(name ="teacher_id"),
              inverseJoinColumns = @JoinColumn(name = "department_id")
    )
    private DepartmentEntity department;

    public Entity(int id, String name, float fee, String city) {
        teacherId = id;
        Name = name;
        Fee = fee;
        City = city;
    }
    public Entity(){
        super();
    }
    public int getId() {
        return teacherId;
    }

    public void setId(int id) {
        teacherId = id;
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
