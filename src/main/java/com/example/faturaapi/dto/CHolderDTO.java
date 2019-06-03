package com.example.faturaapi.dto;

import java.io.Serializable;

public class CHolderDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String cpf;
    private String sex;
    private String maritalStatus;
    private String scholarity;

    public CHolderDTO() {
    }

    public CHolderDTO(String cpf, String sex, String maritalStatus, String scholarity) {
        this.cpf = cpf;
        this.sex = sex;
        this.maritalStatus = maritalStatus;
        this.scholarity = scholarity;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
