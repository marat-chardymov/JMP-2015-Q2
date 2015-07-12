package com.example.model;

import javax.persistence.Embeddable;

/**
 * Created by Razor on 7/12/2015.
 */
@Embeddable
public class UserInfo {
    private String secretFiles;

    public UserInfo(){
    }

    public UserInfo(String secretFiles){
        this.secretFiles = secretFiles;
    }

    public String getSecretFiles() {
        return secretFiles;
    }

    public void setSecretFiles(String secretFiles) {
        this.secretFiles = secretFiles;
    }
}
