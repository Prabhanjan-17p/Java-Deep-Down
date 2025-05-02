package Class_Program;
        /*
        Definition --
        The set of statement executed on a resource an resources using ACID properties is known as Transaction.
        A - Atomicity
            => The process complete the transaction to completed state or not (Transaction comes to Zero State),is known as Atomicity
        C - Consistency
            => the process in which the resources state remains same until the transaction is completed is known as Consistency
        I - Isolation
            => The process in which multiple user executing independently is known as isolation.
        D - Durability
            => once the transaction successful we have to record the state of the translation is known as durability.

        Define Transaction Management
            => The process of controlling the transaction from starting to ending is known as Transaction Management.
            => The following method used are used in transaction management process
            EX-
                1. setAutoCommit()
                2. getAutoCommit()
                3. setSavePoint()
                4. removeSavePoint()
                5. commit()
                6. rollback()

            1. setAutoCommit()
                => This method is used to set autoCommit operation to false, because the java program perform Commit operation automatically.

            2. getAutoCommit()
                => This method is used to known the state of commit operation.

            3. setSavePoint()
                => setSavePoint() method is used to set the savePoint for rollback operation.

            4. removeSavePoint()
                => This removeSavePoint() method is used to delete the savePoint().

            5. commit();
                => commit() method is used perform commit operation after the transaction is successfully.

            6. rollback();
                => rollback method is used to perform rollback operation when the transaction is failed.
         */

import java.sql.*;
import java.util.Scanner;

public class Transaction_Management {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","MYDB","MYDB");
            System.out.println("Commit Status: "+con.getAutoCommit());
            con.setAutoCommit(false);
            System.out.println("Commit Status: "+con.getAutoCommit());

            Savepoint sp = con.setSavepoint();
            PreparedStatement ps1 = con.prepareStatement("select * from bank45 where accno=?");
            PreparedStatement ps2 = con.prepareStatement("update bank45 set balance = balance+? where accno = ?");

            System.out.println("Enter homeAccountNo: ");
            long hmAcNo =Long.parseLong(sc.nextLine());
            ps1.setLong(1,hmAcNo);
            ResultSet rs1 = ps1.executeQuery();
            if (rs1.next()){
                float bal = rs1.getFloat(3);
                System.out.println("Enter beneficiary Account Number: ");
                long bAc = Long.parseLong(sc.nextLine());
                ps1.setLong(1,bAc);
                ResultSet rs2 = ps1.executeQuery();
                if (rs2.next()){
                    System.out.println("Enter the amt be transfer: ");
                    int amt = Integer.parseInt(sc.nextLine());
                    if (amt <= bal){
                        ps2.setInt(1,-amt);
                        ps2.setLong(2,hmAcNo);
                        int i = ps2.executeUpdate(); // Buffer Updated because of setSavePoint is false

                        ps2.setInt(1,amt);
                        ps2.setLong(2,bAc);
                        int j = ps2.executeUpdate(); // Buffer Updated because of setSavePoint is false

                        if (i==1 && j==1){
                            System.out.println("Transaction Successfully");
                            con.commit(); // Database Updated
                        }else {
                            System.out.println("Transaction Not Success!!!");
                            con.rollback();
                        }
                    }else {
                        System.out.println("Insufficient found!!!");
                    }

                }else {
                    System.out.println("Invalid beneficiary account number!!!");
                }

            }else {
                System.out.println("Invalid Account Number!!!");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
