package com.example.onetoone.Entity;

import javax.persistence.*;

@Entity
public class UniversityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "university_Id")
    private int universityId;
    private String universityName;
    private String universityCity;
    @OneToOne(cascade =CascadeType.ALL)
    @JoinColumn(name = "fk_collegeId")
//    @JoinTable(name = "UniversityCollege",
//            joinColumns ={ @JoinColumn(name = "universityId")},
//            inverseJoinColumns ={@JoinColumn(name="collegeId")})
    private CollegeEntity college;

    public UniversityEntity(int universityId, String universityName, String universityCity) {
        this.universityId = universityId;
        this.universityName = universityName;
        this.universityCity = universityCity;
    }

    public UniversityEntity() {
        super();
    }

    public int getUniversityId() {
        return universityId;
    }

    public void setUniversityId(int universityId) {
        this.universityId = universityId;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityCity() {
        return universityCity;
    }

    public void setUniversityCity(String universityCity) {
        this.universityCity = universityCity;
    }




}
