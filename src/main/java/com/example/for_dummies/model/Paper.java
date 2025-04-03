package com.example.for_dummies.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "papers")
public class Paper {

	@Id 
	private String id;
	private String title ;
	private String authot_id;
	private Date created_at;
	private List<String> keywords;  
	private int readabilityScore;  
	private int viewCount; 
	private int likesCount;  

	//TODO add constrcutor of paper
	//TODO add the files after ai logic

	
}
