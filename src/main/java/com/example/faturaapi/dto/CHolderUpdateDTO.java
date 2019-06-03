package com.example.faturaapi.dto;

public class CHolderUpdateDTO {

    private String sex;
    private String maritalStatus;
    private String scholarity;

    public CHolderUpdateDTO() {
    }

    public CHolderUpdateDTO(String sex, String maritalStatus, String scholarity) {
        this.sex = sex;
        this.maritalStatus = maritalStatus;
        this.scholarity = scholarity;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getScholarity() {
        return scholarity;
    }

    public void setScholarity(String scholarity) {
        this.scholarity = scholarity;
    }
}
