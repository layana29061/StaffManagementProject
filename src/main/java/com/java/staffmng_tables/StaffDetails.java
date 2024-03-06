package com.java.staffmng_tables;

public class StaffDetails {
    private int id;
    private String name;
    private String gender;
    private String department;
    private String position;
    private int yearOfExperience;
    private int salary;
    private String email;
    private String phoneNumber;

    // Getters
    public int getId() {
    	return id; 
    }
    public String getName() {
    	return name; 
    }
    public String getGender() {
    	return gender; 
    }
    public String getDepartment() {
    	return department; 
    }
    public String getPosition() {
    	return position; 
    }
    public int getYearOfExperience() {
    	return yearOfExperience; 
    }
    public int getSalary() {
    	return salary; 
    }
    public String getEmail() {
    	return email; 
    }
    public String getPhoneNumber() {
    	return phoneNumber; 
    }

    // Setters
    public void setId(int id) {
    	this.id = id; 
    }
    public void setName(String name) {
    	this.name = name; 
    }
    public void setGender(String gender) { 
    	this.gender = gender; 
    }
    public void setDepartment(String department) {
    	this.department = department; 
    }
    public void setPosition(String position) { 
    	this.position = position; 
    }
    public void setYearOfExperience(int yearOfExperience) {
    	this.yearOfExperience = yearOfExperience; 
    }
    public void setSalary(int salary) {
    	this.salary = salary; 
    }
    public void setEmail(String email) {
    	this.email = email; 
    }
    public void setPhoneNumber(String phoneNumber) { 
    	this.phoneNumber = phoneNumber; 
    }
    
	@Override
	public String toString() {
		return "StaffDetails [id=" + id + ", name=" + name + ", gender=" + gender + ", department=" + department
				+ ", position=" + position + ", yearOfExperience=" + yearOfExperience + ", salary=" + salary
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}
}

