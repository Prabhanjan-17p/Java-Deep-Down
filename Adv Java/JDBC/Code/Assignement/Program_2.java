package Assignement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Program_2 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter EMPID: ");
			String eId = sc.nextLine();
			System.out.print("Enter EMPNAME: ");
			String eName = sc.nextLine();
			System.out.print("Enter EMPDESG: ");
			String eDes = sc.nextLine();
			System.out.print("Enter Basic Salary: ");
			int bsal = sc.nextInt();
			float totSal = bsal +(0.93F*bsal)+(0.63F*bsal);
			
			//Connect to the database
			Connection con = DriverManager.getConnection
	("jdbc:oracle:thin:@localhost:1521:orcl","MYDB","MYDB");
			
			/*
			 ** prepareStatement() method will compile the query Structure.
			 ** If the compilation is successfully then prepareStatement() method will create fields equal to the parameter indexes.
			 * It will first Compile the according to the parameter it will be create n-Number of Fields(PreparedStatement response it)
			 * Once it successfully create then the reference will available on the ps variable
			 * The main purpose of PreparedStament once it execute it will used many  time (it will be execute only once)
			 ** Once Compile we can run n-Number o time.
			 * 
			 */
			PreparedStatement ps = con.prepareStatement
	("INSERT INTO Employee45 VALUES(?,?,?,?,?)");
			
			//Using Setter Method We load the data from the user
			//we use setter methods to set the data to the fields based on parameter index and then executed.
			ps.setString(1, eId);
			ps.setString(2, eName);
			ps.setString(3, eDes);
			ps.setInt(4, bsal);
			ps.setFloat(5, totSal);
			
			//Execution Process(Internally the data will be updated here)
			int k = ps.executeUpdate();
			if (k > 0) {
				System.out.println("Emp details inserted successfully");
			}else {
				System.out.println("Not insert data!!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
