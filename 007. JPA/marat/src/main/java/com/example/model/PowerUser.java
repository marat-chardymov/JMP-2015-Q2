package com.example.model;

import javax.persistence.Entity;

/**
 * Created by Razor on 7/11/2015.
 */
@Entity
public class PowerUser extends AbstractUser {
    private String specialPower;

    public PowerUser() {
    }

    public PowerUser(String name, String power) {
        super(name);
        this.specialPower = power;
    }

    public String getSpecialPower() {
        return specialPower;
    }

    public void setSpecialPower(String specialPower) {
        this.specialPower = specialPower;
    }
}
