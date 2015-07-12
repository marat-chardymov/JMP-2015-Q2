package com.example.model;

import javax.persistence.Entity;

/**
 * Created by Razor on 7/12/2015.
 */
@Entity
public class Avatar extends AbstractEntity{
    String asciiAvatar;

    public Avatar() {
    }

    public Avatar(String asciiAvatar) {
        this.asciiAvatar = asciiAvatar;
    }

    public String getAsciiAvatar() {
        return asciiAvatar;
    }

    public void setAsciiAvatar(String asciiAvatar) {
        this.asciiAvatar = asciiAvatar;
    }
}
