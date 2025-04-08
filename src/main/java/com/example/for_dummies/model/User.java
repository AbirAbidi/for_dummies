package com.example.for_dummies.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

	@Id
	private String id;
	private String name;
	private String LastName;
	private int age;
	private String EdLevel;
	private String Email ;
	private String bio;
	private int number_of_papers;
	private String password;
	
	
	public User( String id,String name,String LastName,int age, String EdLevel,String password,String Email , String bio ,  int number_of_papers) {
		this.id= id ;
		this.name = name;
		this.LastName = LastName;
		this.age = age;
		this.EdLevel = EdLevel;
		this.password = password;
		this.Email = Email ;
		this.bio = bio; 
		this.number_of_papers = number_of_papers ; 
	}
	
	
	
	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public int getNumber_of_papers() {
		return number_of_papers;
	}

	public void setNumber_of_papers(int number_of_papers) {
		this.number_of_papers = number_of_papers;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEdLevel() {
		return EdLevel;
	}

	public void setEdLevel(String edLevel) {
		EdLevel = edLevel;
	}
	
	
	
	
	
}
