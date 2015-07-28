package com.example.model;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Marat_Chardymau on 7/28/2015.
 */
public class File {
  private MultipartFile file;

  public MultipartFile getFile() {
    return file;
  }

  public void setFile(MultipartFile file) {
    this.file = file;
  }
}
