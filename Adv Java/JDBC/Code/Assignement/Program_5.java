package Assignement;
/*
Ex_App1ication :
JDBC Application to delete Product on pCode?
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Program_5 {
        public static void main(String[] args) {
            try{
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","MYDB","MYDB");
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the PCODE: ");
                String pCode = sc.nextLine();

                PreparedStatement ps1 = con.prepareStatement
                        ("SELECT * FROM PRODUCT45 WHERE PCODE = ?");
                PreparedStatement ps2 = con.prepareStatement
                        ("DELETE FROM PRODUCT45 WHERE PCODE =?");

                ps1.setString(1,pCode);
                ResultSet res1 = ps1.executeQuery();
                if (res1.next()){
                    ps2.setString(1,pCode);
                    int x = ps2.executeUpdate();
                    if (x>0){
                        System.out.println("Delete Successfully");
                    }else{
                        System.out.println("Not Delete!!!");
                    }
                }else {
                    System.out.println("Invalid PCODE!!!");
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
    }
}
