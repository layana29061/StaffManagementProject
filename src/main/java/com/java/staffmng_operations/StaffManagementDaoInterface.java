package com.java.staffmng_operations;

import com.java.staffmng_tables.StaffDetails;

public interface StaffManagementDaoInterface {

	//writing all CRUD operations here
	
	//Create Staff
	public void addStaff(StaffDetails staff) throws Exception;
	
	//Display Staff
	public void displayStaffDetails();
	
	//Update Staff
	public void updateStaffDetails(int id,String name);
	
	//Delete Staff
	public void deleteStaffDetails(int id);
}
