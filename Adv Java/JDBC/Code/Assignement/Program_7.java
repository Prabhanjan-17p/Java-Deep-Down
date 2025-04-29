package Assignement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Program_7 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Employee ID: ");
            int eid = Integer.parseInt(sc.nextLine());
            System.out.println("Enter Employee Name: ");
            String ename = sc.nextLine();
            System.out.println("Enter Employee Designation: ");
            String edesg = sc.nextLine();
            System.out.println("Enter House Number: ");
            String hno = sc.nextLine();
            System.out.println("Enter Street Name: ");
            String sname = sc.nextLine();
            System.out.println("Enter City Name: ");
            String city = sc.nextLine();
            System.out.println("Enter Pincode: ");
            String pincode = sc.nextLine();
            System.out.println("Enter Phone Number: ");
            String phno = sc.nextLine();
            System.out.println("Enter Basic Salary: ");
            double bsal = Double.parseDouble(sc.nextLine());
            System.out.println("Enter Total Salary: ");
            double totsal = Double.parseDouble(sc.nextLine());

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","MYDB","MYDB");
            CallableStatement cs = con.prepareCall("{call InsertEmployeeData45(?,?,?,?,?,?,?,?,?,?)}");

            cs.setInt(1, eid);
            cs.setString(2, ename);
            cs.setString(3, edesg);
            cs.setString(4, hno);
            cs.setString(5, sname);
            cs.setString(6, city);
            cs.setString(7, pincode);
            cs.setString(8, phno);
            cs.setDouble(9, bsal);
            cs.setDouble(10, totsal);

            cs.executeUpdate();

            System.out.println("Data insert successfully...");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
