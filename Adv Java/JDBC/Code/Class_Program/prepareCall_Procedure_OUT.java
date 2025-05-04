//package Class_Program;
//
//import java.lang.reflect.Type;
//import java.sql.CallableStatement;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Types;
//import java.util.Scanner;
//
//public class prepareCall_Procedure_OUT {
//    public static void main(String[] args) {
//        try{
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Enter you account number :");
//            long acNo = Long.parseLong(sc.nextLine());
//
//            Connection con = DriverManager.getConnection
//      ("jdbc:oracle:thin:@localhost:1521/orcl", "MYDB", "MYDB");
//
//            // total ? = 7 parameter 1 parameter is taking the data from user
//            CallableStatement cs = con.prepareCall
//                    ("{call RetriveDetails45(?,?,?,?,?,?,?)}");
//
//            cs.setLong(1,acNo);
//            cs.registerOutParameter(2, Types.VARCHAR);
//            cs.registerOutParameter(3, Types.FLOAT);
//            cs.registerOutParameter(4, Types.VARCHAR);
//            cs.registerOutParameter(5, Types.VARCHAR);
//            cs.registerOutParameter(6, Types.VARCHAR);
//            cs.registerOutParameter(7, Types.BIGINT);
//
//            cs.execute();
//
//            System.out.println("Account Number: "+acNo);
//            System.out.println("Cust Name: "+cs.getString(2));
//            System.out.println("balance: "+cs.getFloat(3));
//            System.out.println("Account Type: "+cs.getString(4));
//            System.out.println("Address: "+cs.getString(5));
//            System.out.println("Mail Id: "+cs.getString(6));
//            System.out.println("Mail Id: "+cs.getLong(7));
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}





package Class_Program;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;

public class prepareCall_Procedure_OUT {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your account number: ");
            long acNo = Long.parseLong(sc.nextLine());

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/orcl", "MYDB", "MYDB"
            );

            // Assuming 7 parameters: 1 IN (accno), 6 OUT
            CallableStatement cs = con.prepareCall(
                    "{call RetriveDetails45(?, ?, ?, ?, ?, ?, ?)}"
            );

            /*
            define registerOutParameter() method?
                =>This registerOutParameter() method specify the type of value to be recorded to the fields of CallableStatement object in OUT-Parameter procedure.
             */
            cs.setLong(1, acNo); // Account Number
            cs.registerOutParameter(2, Types.VARCHAR); // custname
            cs.registerOutParameter(3, Types.FLOAT);   // balance
            cs.registerOutParameter(4, Types.VARCHAR); // acctype
            cs.registerOutParameter(5, Types.VARCHAR); // address
            cs.registerOutParameter(6, Types.VARCHAR); // email
            cs.registerOutParameter(7, Types.VARCHAR); // phone number (VARCHAR to support leading 0s)

            cs.execute();

            System.out.println("\n--- Account Details ---");
            System.out.println("Account Number: " + acNo);
            System.out.println("Customer Name : " + cs.getString(2));
            System.out.println("Balance       : " + cs.getFloat(3));
            System.out.println("Account Type  : " + cs.getString(4));
            System.out.println("Address       : " + cs.getString(5));
            System.out.println("Email ID      : " + cs.getString(6));
            System.out.println("Phone Number  : " + cs.getString(7));

            cs.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
