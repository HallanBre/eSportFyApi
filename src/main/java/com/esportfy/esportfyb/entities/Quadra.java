package com.esportfy.esportfyb.entities;

import com.esportfy.esportfyb.enums.QuadraType;
import jakarta.persistence.*;


@Table(name = "quadras")
@Entity
public class Quadra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String date;
    private QuadraType type;


    public Quadra(int id, String name, String address, String phone, String email, String date, QuadraType type) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.date = date;
        this.type = type;
    }

    public Quadra() {
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

    public QuadraType getType() {
        return type;
    }

    public void setType(QuadraType type) {
        this.type = type;
    }
}
