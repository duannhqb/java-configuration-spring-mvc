package edu.poly.manager.model;

import java.util.List;

public class UserDTO {
	private int id;
	private String name;
	private String password;
	private String gender;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	private List<String> soThich;

	public UserDTO() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getSoThich() {
		return soThich;
	}

	public void setSoThich(List<String> soThich) {
		this.soThich = soThich;
	}
}
