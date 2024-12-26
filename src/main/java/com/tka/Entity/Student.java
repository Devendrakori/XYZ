package com.tka.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	@Column(name = "s_id")
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roll;
	private String name;
	private int marks;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "add_id", referencedColumnName = "id")
	private Address address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, int marks) {
		super();
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Address getAdd() {
		return address;
	}

	public void setAdd(Address add) {
		this.address = add;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}

}
