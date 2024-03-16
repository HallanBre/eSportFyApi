package com.esportfy.esportfyb.dto;

import com.esportfy.esportfyb.entities.Quadra;

public class QuadraDto {

    private int id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String date;

    public QuadraDto(Quadra quadra) {
        this.id = quadra.getId();
        this.name = quadra.getName();
        this.address = quadra.getAddress();
        this.phone = quadra.getPhone();
        this.email = quadra.getEmail();
        this.date = quadra.getDate();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
