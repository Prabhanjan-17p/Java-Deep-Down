package Class_Program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/*
Ex_App1ication :
JDBC Application to update Product Price and qty based on pCode?
 */
public class UpdateStatement {
    public static void main(String[] args) {
        try{
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","MYDB","MYDB");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the PCODE: ");
            String pCode = sc.nextLine();

            PreparedStatement ps1 = con.prepareStatement
                    ("SELECT * FROM PRODUCT45 WHERE PCODE = ?");
            PreparedStatement ps2 = con.prepareStatement
                    ("UPDATE PRODUCT45 SET PPRICE=? , PQTY=PQTY+? WHERE PCODE =?");

            ps1.setString(1,pCode);
            ResultSet res1 = ps1.executeQuery();
            if (res1.next()){
                System.out.println("Old Price: "+res1.getFloat(3));
                System.out.println("Enter the new price: ");
                float newPrice = Float.parseFloat(sc.nextLine());
                System.out.println("Available QTY is : "+res1.getInt(4));
                System.out.println("Enter new QTY: ");
                int newQTY = Integer.parseInt(sc.nextLine());
                ps2.setFloat(1,newPrice);
                ps2.setInt(2,newQTY);
                ps2.setString(3,pCode);
                int x = ps2.executeUpdate();
                if (x>0){
                    System.out.println("Update Successfully");
                }else{
                    System.out.println("Not Update!!!");
                }
            }else {
                System.out.println("Invalid PCODE!!!");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
