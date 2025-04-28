package Assignement;
		/*
Assignment 3:
DB Table : UserReg45(uname, pword, fname , Iname , addr, mid, phno)
Primary Key : uname and pword
Construct JDBC Application to perform the following operations based on User
Choice: (Using PreparedStatement)
1. Register
2. Login
		 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Program_3 {

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("WellCome to Your App!!!");
			System.out.print("Enter you choice 1-Register and 2-Login: ");
			int ch = Integer.parseInt(sc.nextLine());
			Connection con = DriverManager.getConnection
	("jdbc:oracle:thin:@localhost:1521:orcl","MYDB","MYDB");
			switch (ch) {
			case 1: {
		        System.out.print("Enter Username: ");
		        String uname = sc.nextLine();
		        System.out.print("Enter Password: ");
		        String pword = sc.nextLine();
		        System.out.print("Enter First Name: ");
		        String fname = sc.nextLine();
		        System.out.print("Enter Last Name: ");
		        String lname = sc.nextLine();
		        System.out.print("Enter Address: ");
		        String addr = sc.nextLine();
		        System.out.print("Enter Email ID: ");
		        String mid = sc.nextLine();
		        System.out.print("Enter Phone Number: ");
		        String phno = sc.nextLine();
		        
				PreparedStatement ps = con.prepareStatement
				("INSERT INTO UserReg45 (?,?,?,?,?,?,?)");
				ps.setString(1, uname);
				ps.setString(2, pword);
				ps.setString(3, fname);
				ps.setString(4, lname);
				ps.setString(5, addr);
				ps.setString(6, mid);
				ps.setString(7, phno);
				
				int x = ps.executeUpdate();
				break;
			}
			case 2: {
				System.out.print("Enter Username: ");
			    String uname = sc.nextLine();
			    System.out.print("Enter Password: ");
			    String pword = sc.nextLine();
			    /*
				Statement stm = con.createStatement();
				ResultSet res = stm.executeQuery
("SELECT * FROM UserReg45 WHERE UNAME ='"+uname+"' AND PWORD='"+pword+"'");
 				if (res.next()) {
					System.out.println("Login Successfully");
				}else {
					System.out.println("Incorrect UserName or Password");
				}
			     */
			    PreparedStatement ps2 = con.prepareStatement
("SELECT * FROM UserReg45 WHERE UNAME =? AND PWORD=?");
			    ps2.setString(1, uname);
			    ps2.setString(2, pword);
//			    int res = ps2.executeUpdate(); // also we can do this
			    ResultSet res = ps2.executeQuery();
				if (res.next()) {
					System.out.println("Login Successfully");
					System.out.println("Wellcome to your system mr/ms: "+res.getString(3));
				}else {
					System.out.println("Incorrect UserName or Password");
				}
				break;
			}
			default:
				System.err.println("Invalid Choice!!!");
			}
			
		} catch (Exception e) {
			
		}
	}

}
