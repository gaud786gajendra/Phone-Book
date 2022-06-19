package com.PhoneBook.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contact_details")
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int contId;
	
	private String name;
	
	private String email;
	
	private long phone;



	public int getContId() {
		return contId;
	}

	public void setContId(int contId) {
		this.contId = contId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Contact [contId=" + contId + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}

	
	
	

}
