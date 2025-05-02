package Test;
import  java.sql.*;
public class Test {
    public static void main(String[] args) {
        try{
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "MYDB","MYDB");
            PreparedStatement fetch = con.prepareStatement("Select * from STDTABLE42 where STUDENTID = ?");

            fetch.setString(1,"TY001");
//            int x = fetch.executeUpdate();
//            System.out.println("Total rows execute: "+x);

            ResultSet res  =fetch.executeQuery();
            while (res.next()){
                System.out.println(res.getString(2));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
