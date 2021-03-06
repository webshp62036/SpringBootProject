package com.example.assignment1.entity;
import javax.persistence.*;
@Entity
@Table(name = "phone")
public class PhoneNo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "p_id")
    private int pId;
    @Column(name = "phone_no")
    private long phoneNo;
    @Column(name = "zip_code")
    private String zipCode;
   // Getter and Setter for all declared fields...
    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
