package Assignement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;

public class Program_8 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your Account Number: ");
            long acno = Long.parseLong(sc.nextLine());

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/orcl", "MYDB", "MYDB"
            );

            CallableStatement cs = con.prepareCall(
                    "{call ?:= RETRIVEBALANCE45(?)}"
            );

            cs.registerOutParameter(1, Types.FLOAT);
            cs.setLong(2,acno);

            cs.execute();

            System.out.println("Account Number : "+acno);
            System.out.println("Current Balance : "+cs.getFloat(1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
