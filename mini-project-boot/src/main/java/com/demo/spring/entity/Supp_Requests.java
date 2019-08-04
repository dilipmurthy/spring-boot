package com.demo.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SUPP_REQUESTS")
public class Supp_Requests {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="REQUEST_ID")
	private int requestId;
	
	@Column(name="EMAIL")
	private String email;
	
	public Supp_Requests() {}
	
	public Supp_Requests(int requestId, String email, String software, String os, String problem) {
		this.requestId = requestId;
		this.email = email;
		this.software = software;
		this.os = os;
		this.problem = problem;
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSoftware() {
		return software;
	}

	public void setSoftware(String software) {
		this.software = software;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	@Column(name="SOFTWARE")
	private String software;
	
	@Column(name="OS")
	private String os;
	
	@Column(name="PROBLEM")
	private String problem;
	
}
