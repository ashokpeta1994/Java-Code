package com.constructors;

import java.util.ArrayList;
import java.util.List;

public class University {

	public String name;
	public String country;
	public String establishedDate;
	List<String> course = new ArrayList<String>();

	public University(String name, String country, String establishedDate, List<String> course) {
		super();
		this.name = name;
		this.country = country;
		this.establishedDate = establishedDate;
		this.course = course;
	}

	public University(String name, String country, String establishedDate) {
		super();
		this.name = name;
		this.country = country;
		this.establishedDate = establishedDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEstablishedDate() {
		return establishedDate;
	}

	public void setEstablishedDate(String establishedDate) {
		this.establishedDate = establishedDate;
	}

	public List<String> getCourse() {
		return course;
	}

	public void setCourse(List<String> course) {
		this.course = course;
	}

}
