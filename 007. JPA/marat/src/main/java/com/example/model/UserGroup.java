package com.example.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Razor on 7/12/2015.
 */
@Entity
public class UserGroup extends AbstractEntity {

    private String userGroupName;
    @OneToMany(cascade = CascadeType.ALL)
    private List<AbstractUser> users = new ArrayList<AbstractUser>();

    public UserGroup() {
    }

    public UserGroup(String userGroupName) {
        this.userGroupName = userGroupName;
    }

    public String getUserGroupName() {
        return userGroupName;
    }

    public void setUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
    }

    public List<AbstractUser> getUsers() {
        return users;
    }

    public void setUsers(List<AbstractUser> users) {
        this.users = users;
    }
}
