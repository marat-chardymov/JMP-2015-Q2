package com.example.dao;

import com.example.model.AbstractUser;
import com.example.model.PowerUser;

import java.util.List;

/**
 * Created by Razor on 7/10/2015.
 */
public interface UserDao {
    void create(AbstractUser user);
    AbstractUser read(int id);
    List<PowerUser> findPowerUsers();
}
