package com.sun.WM;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Wmachine {
	
	@Id
	@GeneratedValue
	private int id;
	@Column(name="Model")
	private String model;
	@Column(name="Brand")
	private String company;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Wmachine [id=" + id + ", model=" + model + ", company=" + company + "]";
	}
	
	
	
	

}
