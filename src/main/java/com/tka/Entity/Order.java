package com.tka.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.tka.Entity.Student;

@Entity
@Table(name = "orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int o_id;
	private String name;
	private int price;

	@ManyToOne
	@JoinColumn(name = "s_id")
	private Student s;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int o_id, String name, int price) {
		super();
		this.o_id = o_id;
		this.name = name;
		this.price = price;
	}

	public int getO_id() {
		return o_id;
	}

	public void setO_id(int o_id) {
		this.o_id = o_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Student getS() {
		return s;
	}

	public void setS(Student s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "Order [o_id=" + o_id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
