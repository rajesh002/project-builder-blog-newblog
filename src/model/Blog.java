package model;

import java.time.LocalDate;

public class Blog{
	String title;
	String description;
	LocalDate postedOn;
	public Blog(String title,String description,LocalDate postedOn){
		this.title=title;
		this.description=description;
		this.postedOn=postedOn;
	}
	public void setBlogDescription(String description) {
		this.description=description;
	}
	
	public void setBlogTitle(String title) {
		this.title=title;
	}
	public void setDate(LocalDate postedOn) {
		this.postedOn=postedOn;
	}
	
	
	public String getBlogDescription() {
		return description;
	}
	public String getBlogTitle() {
		return title;
	}
	
	public LocalDate getDate() {
		return postedOn;
	}
}