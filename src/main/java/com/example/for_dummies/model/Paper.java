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
	private int likesCount;  

	
	
	public Paper( String id,String title,String authot_id,Date created_at, List<String>  keywords,int LikesCount) {
		this.id= id ;
		this.title = title;
		this.authot_id = authot_id;
		this.created_at = created_at;
		this.keywords = keywords;
		this.likesCount = LikesCount;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getAuthot_id() {
		return authot_id;
	}



	public void setAuthot_id(String authot_id) {
		this.authot_id = authot_id;
	}



	public Date getCreated_at() {
		return created_at;
	}



	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}



	public List<String> getKeywords() {
		return keywords;
	}



	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}



	public int getLikesCount() {
		return likesCount;
	}



	public void setLikesCount(int likesCount) {
		this.likesCount = likesCount;
	}
	
	
	//TODO add the files after ai logic

	
}
