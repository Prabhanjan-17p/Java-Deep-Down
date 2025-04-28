package Assignement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collections;
import java.util.Scanner;

/*
Assignment :
JDBC application to perform the following operations on Book45 based
on user choice:
1. AddBook
2. ViewAllBooks
3. ViewBookByBookCode
4. UpdateBookByBookCode(Price and Qty)
5. DeleteBookByBookCode
6. Exit
 */
public class Program_6 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "MYDB", "MYDB");
            PreparedStatement AddBook = con.prepareStatement("INSERT INTO BOOKDB VALUES(?,?,?,?)");
            PreparedStatement ViewAllBooks = con.prepareStatement("SELECT * FROM BOOKDB45");
            PreparedStatement ViewBookByBookCode = con.prepareStatement("SELECT * FROM BOOKDB45 WHERE BCODE=?");
            PreparedStatement UpdateBookByBookCode = con.prepareStatement("UPDATE BOOKDB45  SET BPRICE=? , BQTY=? WHERE BCODE=?");
            PreparedStatement DeleteBookByBookCode = con.prepareStatement("DELETE FROM BOOKDB45 WHERE BCODE=?");

            boolean ch= true;
            while (ch){
                System.out.println("Enter you choice \n1. AddBook\n" +
                        "2. ViewAllBooks\n" +
                        "3. ViewBookByBookCode\n" +
                        "4. UpdateBookByBookCode(Price and Qty)\n" +
                        "5. DeleteBookByBookCode\n" +
                        "6. Exit");
                System.out.print("Enter Your Choice : ");
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice){
                    case 1:
                        System.out.print("Enter Book Code : ");
                        String bCode = sc.nextLine();
                        System.out.print("Enter Book Name : ");
                        String bName = sc.nextLine();
                        System.out.print("Enter Book Price : ");
                        float bPrice = Float.parseFloat(sc.nextLine());
                        System.out.print("Enter Book QTY : ");
                        int bQTY = Integer.parseInt(sc.nextLine());
                        AddBook.setString(1,bCode);
                        AddBook.setString(2,bName);
                        AddBook.setFloat(3,bPrice);
                        AddBook.setInt(4,bQTY);
                        int x = AddBook.executeUpdate();
                        if (x > 0){
                            System.out.println("Book insert successfully");
                        }else {
                            System.out.println("Book not add!!!");
                        }
                        break;
                    case 2:
                       ResultSet res = ViewAllBooks.executeQuery();
                       while (res.next()){
                           System.out.println(res.getString(1)+"\t"+res.getString(2)+"\t"+res.getFloat(3)+"\t"+res.getInt(4));
                       }
                        break;
                    case 3:
                        System.out.print("Enter Book Code : ");
                        String bCOde1 = sc.nextLine();
                        ViewBookByBookCode.setString(1,bCOde1);
                        int z = ViewBookByBookCode.executeUpdate();
                        ResultSet res2 = ViewBookByBookCode.executeQuery();
                        if (z > 0){
                            while (res2.next()){
                                System.out.println(res2.getString(1)+"\t"+res2.getString(2)+"\t"+res2.getFloat(3)+"\t"+res2.getInt(4));
                            }
                        }else{
                            System.out.println("Invalid Book Code!!!");
                        }
                        break;
                    case 4:
                        System.out.print("Enter your Book Code");
                        String bCode2 = sc.nextLine();
                        ViewBookByBookCode.setString(1,bCode2);
                        ResultSet res3 = ViewBookByBookCode.executeQuery();
                        if (res3.next()){
                            System.out.println("Old Price : "+res3.getFloat(3));
                            System.out.print("Enter your new price : ");
                            float newPrice = Float.parseFloat(sc.nextLine());
                            System.out.println("Old QTY : "+res3.getInt(4));
                            int newQTY = Integer.parseInt(sc.nextLine());
                            UpdateBookByBookCode.setFloat(1,newPrice);
                            UpdateBookByBookCode.setInt(2,newQTY);
                            UpdateBookByBookCode.setString(3,bCode2);
                            int y = UpdateBookByBookCode.executeUpdate();
                            if (y>0){
                                System.out.println("Update book successfully");
                            }else {
                                System.out.println("Not Update yet!!!");
                            }
                        }else {
                            System.out.println("Invalid Book Code!!!");
                        }
                        break;
                    case 5:
                        System.out.print("Enter your Book Code");
                        String bCode3 = sc.nextLine();
                        ViewBookByBookCode.setString(1,bCode3);
                        ResultSet res4 = ViewBookByBookCode.executeQuery();
                        if (res4.next()){
                            DeleteBookByBookCode.setString(1,bCode3);
                            int y = UpdateBookByBookCode.executeUpdate();
                            if (y>0){
                                System.out.println("Delete book successfully");
                            }else {
                                System.out.println("Not delete yet!!!");
                            }
                        }else {
                            System.out.println("Invalid Book Code!!!");
                        }
                        break;
                    case 6:
                        System.out.println("----------------THANK YOU VISIT AGAIN----------------");
                        ch = false;
                        break;
                    default:
                        System.out.println("Enter a write choice!!!");
                        break;
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
