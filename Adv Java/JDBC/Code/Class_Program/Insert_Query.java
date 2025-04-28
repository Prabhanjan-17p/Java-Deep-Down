package Class_Program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Insert_Query {
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

            Connection con = DriverManager.getConnection
                    ("jdbc:oracle:thin:@localhost:1521:orcl","MYDB","MYDB");

            PreparedStatement ps = con.prepareStatement
                    ("INSERT INTO Employee45 VALUES(?,?,?,?,?)");

            ps.setString(1, eId);
            ps.setString(2, eName);
            ps.setString(3, eDes);
            ps.setInt(4, bsal);
            ps.setFloat(5, totSal);

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
