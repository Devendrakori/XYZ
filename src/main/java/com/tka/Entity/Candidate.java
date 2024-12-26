package com.tka.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "candidate1")
public class Candidate implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int cid;
	private String name;
	@Column(name = "party")
	private String pname;
	private String assembly;
	private String state;
	private String gender;
	private int age;
	
	public Candidate() {
		super();
	}
	public Candidate(int cid, String name, String pname, String assembly, String state, String gender, int age) {
		super();
		this.cid = cid;
		this.name = name;
		this.pname = pname;
		this.assembly = assembly;
		this.state = state;
		this.gender = gender;
		this.age = age;
	}
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getAssembly() {
		return assembly;
	}
	public void setAssembly(String assembly) {
		this.assembly = assembly;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Candidate [name=" + name + ", pname=" + pname + ", assembly=" + assembly + "]";
	}
	
	
}
