package Class_Program;

/*
Batch Processing
    => The process of collecting multiple query as batch and "executing at a time" is known as Batch Processing.
    => The following are the method used in Batch Processing :
        a- addBatch()
        b- executeBatch()
        c- clearBatch()
    a- addBatch()
        => This addBatch() method is used to add query to the batch.
        Method Signature : public abstract void addBatch(java.lang.sql) throws java.sql.SQLException;
    b- executeBatch()
        => This executeBatch() method is used to execute the queries from the batch at-a-time.
        Method Signature : public abstract int[] executeBatch() throws java.sql.SQLException;
    c- clearBatch()
        => This clearBatch() method is used to clear all the query from the batch and delete the batch.
        Method Signature : public abstract void clearBatch() throws java.sql.SQLException;

    Note Case 1 => Batch processing using "statement" we can updated multiple database tables at-a-time.

    Note Case 2 => Batch processing using "PreparedStatement" we can update multiple records into same database table.

    ** What is the advantage of Batch Processing?
        => In batch processing the execution control is transferred to database only once and executes all the queries from the batch at-a-time,in this process the execution time will be save and generate high Performance of an application.

    ** What is the diff between Batch Processing VS Procedure?
        => Using Batch processing we can execute only Non-Select queries on database product, Which means it is batch update processing(Means we can do Update query).
        => Using Procedure we can execute both select and non-select query.

 */


import  java.sql.*;
import java.util.Scanner;

public class Batch_Processing {
    public static void main(String[] args) {
        //Case 1 - Batch Processing using Statement(In database multiple table with single values)
        /*
        try {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","MYDB","MYDB");
            Statement stm = con.createStatement();
            stm.addBatch("insert into product45  values('P006','ER',123,12)");
            stm.addBatch("insert into Bank45 values(1013,'alex',234,'saving')");
            stm.addBatch("insert into CUSTDETAILS45 values(1013,'SRN','as@...',7878)");

            int [] k = stm.executeBatch();
            for (int i=0;i<k.length;i++){
                System.out.println("Data Updated...");
            }
            stm.clearBatch();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
         */

        //Case 2 - Batch Processing using Prepare Statement(In data base one table with multiple value)
        try {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","MYDB","MYDB");
            PreparedStatement ps = con.prepareStatement
                    ("insert into product45 values(?,?,?,?)");
            ps.setString(1,"P007");
            ps.setString(2,"TRY");
            ps.setFloat(3,2233);
            ps.setInt(4,122);
            ps.addBatch();

            ps.setString(1,"P008");
            ps.setString(2,"Catch");
            ps.setFloat(3,4455);
            ps.setInt(4,233);
            ps.addBatch();

            int [] k = ps.executeBatch();
            for (int i=0;i<k.length;i++){
                System.out.println("Data updated...");
            }
            ps.clearBatch();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
