package com.java.staffmng;

import java.util.Scanner;
import com.java.staffmng_operations.StaffManagementDaoImplementation;
import com.java.staffmng_operations.StaffManagementDaoInterface;
import com.java.staffmng_tables.StaffDetails;

public class Main{
	
	public static void main(String[] args) throws Exception {
	
		StaffManagementDaoInterface dao= new StaffManagementDaoImplementation();
		
		System.out.println("WELCOME TO STAFF MANAGEMENT APPLICATION");
		Scanner sc = new Scanner(System.in);
		Scanner sc_string = new Scanner(System.in);
		
		do {
			System.out.println(
					"1.Add Staff\n" +
					"2.Display Staff Details\n" +
					"3.Update Staff Details\n" +
					"4.Delete Staff Details\n"
			);
			System.out.println("Enter your Choice:");
			int choice =sc.nextInt();
			
			switch(choice){
				case 1:
					//Inserting into database
					StaffDetails staff = new StaffDetails();
					StaffManagementDaoImplementation sd = new StaffManagementDaoImplementation();
					
					System.out.println("The last entered ID is: " + sd.getLastId());
					
					System.out.println("Enter the id: ");
                    int id = sc.nextInt();
 
                    System.out.println("Enter the name: ");
                    String name = sc_string.nextLine();
 
                    System.out.println("Enter the gender: ");
                    String gender = sc_string.nextLine();
 
                    System.out.println("Enter the department: ");
                    String dept = sc_string.nextLine();
 
                    System.out.println("Enter the position: ");
                    String pos = sc_string.nextLine();
 
                    System.out.println("\nEnter the exp: ");
                    int exp = sc.nextInt();
 
                    System.out.println("\nEnter the salary: ");
                    int salary = sc.nextInt();

 
                    System.out.println("\nEnter the email: ");
                    String mail = sc_string.nextLine();
 
                    System.out.println("\nEnter the pnno: ");
                    String phone = sc_string.nextLine();

                    
                    staff.setId(id);
                    staff.setName(name);
                    staff.setGender(gender);
                    staff.setDepartment(dept);
                    staff.setPosition(pos);
                    staff.setYearOfExperience(exp);
                    staff.setSalary(salary);
                    staff.setEmail(mail);
                    staff.setPhoneNumber(phone);
                    
					dao.addStaff(staff);
					break;
					
				case 2:
					System.out.println("Displaying the entire staff details:");
					dao.displayStaffDetails();
					break;
					
				case 3:
					System.out.println("Updated the Staff Details:");
					break;
					
				case 4:
					System.out.println("Enter the staff id to be deleted:");
					int Staffid=sc.nextInt();
					dao.deleteStaffDetails(Staffid);
					break;
				
				case 5:
					System.out.println("Thank You For Using Our Application....!!!");
					System.exit(0);
					
				default:
					System.out.println("Enter valid choice....!");
					break;
			}
		}while(true);
	}
}
