package com.java.staffmng_operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.java.staffmng.DBConnection;
import com.java.staffmng_tables.StaffDetails;

public class StaffManagementDaoImplementation implements StaffManagementDaoInterface {

	public void addStaff(StaffDetails staff) throws Exception {
		Connection con = DBConnection.createDBConnection();
		String query = "insert into staffdb values(?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement pstm =con.prepareStatement(query);
		pstm.setInt(1,staff.getId());
		pstm.setString(2,staff.getName());
		pstm.setString(3,staff.getGender());
		pstm.setString(4,staff.getDepartment());
		pstm.setString(5,staff.getPosition());
		pstm.setInt(6,staff.getYearOfExperience());
		pstm.setInt(7,staff.getSalary());
		pstm.setString(8,staff.getEmail());
		pstm.setDouble(9,staff.getPhoneNumber());
		
		int count =pstm.executeUpdate();
		//return type of excuteUpdate is integer
		if(count!=0) {
			System.out.println("Staff Inserted Successfully!!!");
		}
	}
	
	public int getLastId() throws Exception {
	    Connection con = DBConnection.createDBConnection();
	    String query = "SELECT staff_id FROM staffdb ORDER BY staff_id DESC LIMIT 1";

	    PreparedStatement pstm = con.prepareStatement(query);
	    ResultSet rs = pstm.executeQuery();

	    if(rs.next()) {
	        return rs.getInt("staff_id");
	    } else {
	        return 0; // Return 0 or any suitable value when there are no records in the table
	    }
	}

	public void displayStaffDetails() {
		// TODO Auto-generated method stub
		
	}

	public void updateStaffDetails(int id, String name) {
		// TODO Auto-generated method stub
		
	}

	public void deleteStaffDetails(int id) {
		// TODO Auto-generated method stub
		
	}


	
}