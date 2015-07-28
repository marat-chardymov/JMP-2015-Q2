package com.example.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by Marat_Chardymau on 7/24/2015.
 */
public class Student {

  public interface ValidationOne {
    // validation group marker interface
  }

  public interface ValidationTwo {
    // validation group marker interface
  }
  @NotBlank(groups = {ValidationOne.class})
  private String name;
  @Min(value = 14, groups = {ValidationOne.class})
  @NotNull(groups = {ValidationTwo.class})
  private Integer age;
  private Integer id;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
}
