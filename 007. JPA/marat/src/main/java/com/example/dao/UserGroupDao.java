package com.example.dao;

import com.example.model.UserGroup;

/**
 * Created by Razor on 7/12/2015.
 */
public interface UserGroupDao {
    void create(UserGroup userGroup);
    UserGroup read(int id);
}
