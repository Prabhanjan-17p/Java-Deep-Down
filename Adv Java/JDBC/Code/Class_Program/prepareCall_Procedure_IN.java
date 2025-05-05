package Class_Program;

import java.sql.*;
import java.util.Scanner;
/*
The main purpose of using {CallableStatement cs = con.prepareCall("{call CreateAccount45(?,?,?,?,?,?,?)}");} at a time we can insert 1 or 2 or more table data
 */

public class prepareCall_Procedure_IN {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the ACNO : ");
            long acno = Long.parseLong(sc.nextLine());
            System.out.println("Enter the CUST Name : ");
            String cName = sc.nextLine();
            System.out.println("Enter the balance: ");
            float acBal = Float.parseFloat(sc.nextLine());
            System.out.println("Enter the AC Type: ");
            String acType = sc.nextLine();
            System.out.println("Enter the AC Address: ");
            String acAddress = sc.nextLine();
            System.out.println("Enter the AC EmailID: ");
            String acEmail = sc.nextLine();
            System.out.println("Enter the AC Mobile Number: ");
            long acMob = Long.parseLong(sc.nextLine());

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "MYDB", "MYDB");
            CallableStatement cs = con.prepareCall("{call CreateAccount45(?,?,?,?,?,?,?)}");

            cs.setLong(1,acno);
            cs.setString(2,cName);
            cs.setFloat(3,acBal);
            cs.setString(4,acType);
            cs.setString(5,acAddress);
            cs.setString(6,acEmail);
            cs.setFloat(7,acMob);

            cs.executeUpdate();

            System.out.println("Procedure executed successfully...");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
