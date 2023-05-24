package com.Restroom_Restroom.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

// Create all entity and getter & setter

@Entity
@Data
@Table(name = "RESTROOM")

public class Restroom {

    @Id
    @Column(name = "ID")
    private int id;


    @Column(name = "Location")
    private String Location;

    @Column(name = "Single_sex_restroom")
    private boolean Single_sex_restroom;

    @Column(name = "Multiple_sex_restroom")
    private boolean Multiple_sex_restroom;

    public Restroom() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public boolean isSingle_sex_restroom() {
        return Single_sex_restroom;
    }

    public void setSingle_sex_restroom(boolean single_sex_restroom) {
        Single_sex_restroom = single_sex_restroom;
    }

    public boolean isMultiple_sex_restroom() {
        return Multiple_sex_restroom;
    }

    public void setMultiple_sex_restroom(boolean multiple_sex_restroom) {
        Multiple_sex_restroom = multiple_sex_restroom;
    }
}

