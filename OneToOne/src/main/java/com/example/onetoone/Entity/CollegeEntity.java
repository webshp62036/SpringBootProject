package com.example.onetoone.Entity;
import javax.persistence.*;

@Entity
public class CollegeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "collegeId")
    private int collegeId;
    private String collegeName;
    private String collegeCity;



    public CollegeEntity(int collegeId, String collegeName, String collegeCity) {
        this.collegeId = collegeId;
        this.collegeName = collegeName;
        this.collegeCity = collegeCity;
    }

    public CollegeEntity() {
     super();
    }

    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollegeCity() {
        return collegeCity;
    }

    public void setCollegeCity(String collegeCity) {
        this.collegeCity = collegeCity;
    }

}
