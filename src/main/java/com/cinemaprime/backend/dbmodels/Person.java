package com.cinemaprime.backend.dbmodels;

import com.cinemaprime.backend.enums.Gender;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public abstract class Person {

  @Id
  public String id;

  public String firstname;
  public String lastname;
  private int alter;
  private Gender gender;

  // public Person() {}

  public Person(String firstname, String lastname) {
	  this.firstname = firstname;
		this.lastname = lastname;
  }

  public Gender getGender() {
      return gender;
  }

  public void setGender(Gender gender) {
      this.gender = gender;
  }

  public int getAlter() {
      return alter;
  }

  public void setAlter(int alter) {
      this.alter = alter;
  }
    
  @Override
  public String toString() {
    return String.format(
      "Person[id=%s, firstName='%s', lastName='%s']",
      id, firstname, lastname);
  }
}
