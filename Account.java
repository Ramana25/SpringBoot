package com.springboot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account {
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	@Column(name="holdername")
	private String name;
	@Column(name="balence")
	private Double balence;
	@Column(name="branch")
	private String branch;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getBalence() {
		return balence;
	}
	public void setBalence(Double balence) {
		this.balence = balence;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
}
