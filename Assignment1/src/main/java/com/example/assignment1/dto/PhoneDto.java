package com.example.assignment1.dto;
public class PhoneDto {
    // field declaration
    private int pId;


    private long phoneNo;
    private String zipCode;
    // getter and setter of above declared fields

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

