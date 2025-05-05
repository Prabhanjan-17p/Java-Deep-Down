package Class_Program;

import javax.sql.RowSet;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.util.Scanner;

/*
** Define 'RowSet' ?
        => RowSet object will encapsulate the rows generated from ResultSets any other data sources.
        => RowSet is an interface from 'javax.sql' package and which is extends 'java.sql.ResultSet' interface.

Following are the interfaces extended from RowSet:
    (a) JDBCRowSet (After retrieve data connection still active)
    (b) CachedRowSet (After retrieve data connection is off or Lost)
        => WebRowSet
            (i) FilteredRowSet
            (ii) JoinRowSet

    Hierarchy of RowSet
    * ResultSet(I)
            --(extends)--> RowSet(I) --(extends)--> JDBCRowSet(I)
                                     --(extends)--> CacheRowSet(I)  --(extends)--> WebRowSet(I)  --(extends)--> FilteredRowSet(I)
                                                                                                 --(extends)--> JoinRowSet(I)
            => JDBCRowSet will hold result set and connection to database is active
      Note - Join-able(I) both are extends JDBCRowSet(I), CacheRowSet(I)

      What is Diff b/w JDBCRowSet VS CacheRowSet
        - JDBCRowSet
        - CacheRowSet
            => CacheRowSet will hold ResultSet but connection to database is inActive or Dis-Connect automatically

    NOTE :
        => WebRowSet is used to transfer  the data from one layer to another layer in Application architectures.
        => FilteredRowSet will hold the data retrieved based on condition.
        => JoinedRowSet will hold the data joined from more than one ResultSet.

    ** Define RowSetFactory?
        =>RowSetFactory is an interface from 'java.sql.RowSet' package and which provide the following methods to create the implementations of RowSet :
            (a) createJdbcRowSet()
            * =>This method is used to create the implementation object of ' JdbcRowSet' .
                Method Signature:
                public abstract javax.sql.RowSet.JdbcRowSet createJdbcRowSet() throws java. sq1.SQLException;
            (b) createCachedRowSet()
            * method is used to create the implementation object of CachedRowSet .
                Method Signature:
                public abstract javax. sql.RowSet.CachedRowSet createCachedRowSet() throws java. sqI. SQLException;
            (c) createWebRowSet()
            * =>This method is used to create the implementation object of ' WebRowSet ' .
                Method Signature:
                public abstract javax.sql.RowSet.WebRowSet createWebRowSet() throws java. sq1.SQLException;
            (d) createFilteredRowSet()
            * => This method is used to create the implementation object of FilteredRowSet' .
                Method Signature :
                public abstract javax.sql.RowSet.FilteredRowSet createFilteredRowSet() throws java. sqI. SQLException;
            (e) createJoinRowSet()
            * =>This method is used to create the implementation object of 'Join
                Method Signature
                public abstract javax.sql.RowSet.JoinRowSet createJoinRowSet()  throws java. sq1.SQLException;
    Note :
        => We use the following methods from  javax.sql.RowSet.RowSetProvider' class to create the implementation object of ' RowSetFactory' interface.
        - public static javax.RowSetFactory newFactory() throws java.sql.SQLException;
        - public static javax.sql.RowSet.RowSetFactory newFactory(java.lang.String, java. lang.C1assLoader)throws java. sql. SQLException;

 */
public class RowSet_Demo {
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver"); //We can load the Driver Manually
            RowSetFactory rsf = RowSetProvider.newFactory(); // Implemented Object of RowSetFactory

            Scanner sc = new Scanner(System.in);
            System.out.println("-------Choice-------");
            System.out.println("1. JDBC RowSet \n2. CacheRowSet");
            System.out.println("Enter the choice: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    JdbcRowSet jsf = rsf.createJdbcRowSet(); // Implemented Object of jdbcRowSet
                    jsf.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
                    jsf.setUsername("MYDB");
                    jsf.setPassword("MYDB");
                    jsf.setCommand("select * from Product45");
                    jsf.execute();
                    while (jsf.next()){
                        System.out.println(jsf.getString(1)+"\t"+jsf.getString(2)+"\t"+jsf.getFloat(3)+"\t"+jsf.getInt(4));
                    }
                    break;
                case 2:
                    CachedRowSet crs = rsf.createCachedRowSet();// // Implemented Object of CachedRowSet
                    crs.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
                    crs.setUsername("MYDB");
                    crs.setPassword("MYDB");
                    crs.setCommand("select * from Bank45");
                    crs.execute();
                    while (crs.next()){
                        System.out.println(crs.getInt(1)+"\t"+
                                crs.getString(2)+"\t"+
                                crs.getFloat(3)+"\t"+
                                crs.getString(4));
                    }
                    break;
                default:
                    System.out.println("Invalid Choice!!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
