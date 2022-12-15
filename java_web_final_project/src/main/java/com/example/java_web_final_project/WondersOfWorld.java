package com.example.java_web_final_project;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class WondersOfWorld {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String wonderName;
    String wonderLocation;
    String img;

    public WondersOfWorld(){

    }


    public WondersOfWorld(Integer id, String wonderName, String wonderLocation, String img) {
        this.id = id;
        this.wonderName =wonderName;
        this.wonderLocation = wonderLocation;
        this.img = img;
    }


    public Integer getId() {
        return id;
    }

    public String getName() {
        return wonderName;
    }

    public String getLocation() {
        return wonderLocation;
    }
    public String getImage(){
        return this.img;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String wonderName) {
        this.wonderName = wonderName;
    }

    public void setLocation(String wonderLocation) {
        this.wonderLocation= wonderLocation;
    }
    public void setImage(String img){
        this.img = img;
    }

    @Override
    public String toString() {
        return "WondersOfWorld{" +
                "id=" + id +
                ", name='" + wonderName + '\'' +
                ", location='" + wonderLocation + '\'' +
                '}';
    }
}
