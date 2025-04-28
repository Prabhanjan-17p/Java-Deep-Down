package Class_Program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Select_Query {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the PCODE: ");
            String pCode = sc.nextLine();
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","MYDB","MYDB");
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery("select * from Product45 where PCODE = '"+pCode+"'");

            if (res.next() == false) {
                System.out.println("Please provide a valid code!!!");
            }
            while(res.next()) {
                System.out.println(res.getString(1)+"\t"+
                        res.getString(2)+"\t"+res.getFloat(3)+"\t"+res.getInt(4));
            }

            res.close();
            stm.close();
            con.close();
//			sc.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
