package Assignement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;

public class Program_10 {
    public static void main(String[] args) {
        try{
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "MYDB", "MYDB");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice: \n1.Insert Data \n2.Display Data ");
            int ch = Integer.parseInt(sc.nextLine());
            switch (ch){
                case 1:
                    System.out.println("Enter the ACNO : ");
                    int acno = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter the Name : ");
                    String cName = sc.nextLine();
                    System.out.println("Enter the AC Type: ");
                    String acType = sc.nextLine();
                    System.out.println("Enter the State: ");
                    String acStatte = sc.nextLine();
                    System.out.println("Enter the City: ");
                    String acCity = sc.nextLine();
                    System.out.println("Enter the PinCode: ");
                    int  acPin = Integer.parseInt(sc.nextLine());

                    CallableStatement cs = con.prepareCall("{call CUSTOMERDB42IN(?,?,?,?,?.?)}");
                    cs.setInt(1,acno);
                    cs.setString(2,cName);
                    cs.setString(3,acType);
                    cs.setString(4,acStatte);
                    cs.setString(5,acCity);
                    cs.setInt(6,acPin);

                    cs.execute();
                    System.out.println("Data Insert successfully!!!");
                    break;
                case 2:
                    CallableStatement outB = con.prepareCall("{call CUSTOMERDB42OUT(?,?,?,?,?,?)}");
                    System.out.println("Enter bank account number: ");
                    int ac = Integer.parseInt(sc.nextLine());

                    outB.setInt(1,ac);
                    outB.registerOutParameter(2, Types.VARCHAR);
                    outB.registerOutParameter(3, Types.VARCHAR);
                    outB.registerOutParameter(4, Types.VARCHAR);
                    outB.registerOutParameter(5, Types.VARCHAR);
                    outB.registerOutParameter(6, Types.INTEGER);

                    outB.execute();
                    
                    System.out.println("\n--- Account Details ---");
                    System.out.println("Account Number: " + ac);
                    System.out.println("Name          : " + outB.getString(2));
                    System.out.println("Account Type  : " + outB.getString(3));
                    System.out.println("State         : " + outB.getString(4));
                    System.out.println("City          : " + outB.getString(5));
                    System.out.println("PIN Code      : " + outB.getInt(6));
                    break;
                default:
                    System.out.println("Enter write choice!!!");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
