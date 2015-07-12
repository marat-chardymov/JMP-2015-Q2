package com.example.model;

import javax.persistence.Entity;

/**
 * Created by Razor on 7/11/2015.
 */
@Entity
public class SuperUser extends AbstractUser {
    private String superAbility;

    public SuperUser() {
    }

    public SuperUser(String name, String superAbility) {
        super(name);
        this.superAbility = superAbility;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }
}
