package com.example.model;

import javax.persistence.*;

/**
 * Created by Razor on 7/10/2015.
 */
@Entity
@Inheritance(strategy= InheritanceType.JOINED)
public abstract class AbstractUser extends AbstractEntity{
    private String name;

    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.EAGER)
    @JoinColumn(name="user_group_id")
    private UserGroup userGroup;

    @OneToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.EAGER)
    private Avatar avatar;

    @Embedded
    private UserInfo userInfo;

    public AbstractUser() {
    }

    public AbstractUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserGroup getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(UserGroup userGroup) {
        this.userGroup = userGroup;
    }

    public Avatar getAvatar() {
        return avatar;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
