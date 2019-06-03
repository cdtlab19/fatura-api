package com.example.faturaapi.dto;

public class CreditCardDTO {

    private String number;
    private String cvv;
    private Integer maxLimit;
    private Integer availableLimit;

    public CreditCardDTO() {
    }

    public CreditCardDTO(String number, String cvv, Integer maxLimit, Integer availableLimit) {
        this.number = number;
        this.cvv = cvv;
        this.maxLimit = maxLimit;
        this.availableLimit = availableLimit;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public Integer getMaxLimit() {
        return maxLimit;
    }

    public void setMaxLimit(Integer maxLimit) {
        this.maxLimit = maxLimit;
    }

    public Integer getAvailableLimit() {
        return availableLimit;
    }

    public void setAvailableLimit(Integer availableLimit) {
        this.availableLimit = availableLimit;
    }
}
