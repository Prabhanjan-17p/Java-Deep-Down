package Class_Program;


/*
Connection Polling
    => The Process of organizing multiple pre-initialized Database connections among multiple users is known as connection polling process.

Behaviour:
    i- User pick the database connection from the pool.
    ii- User uses the connection to perform operations on DataBase
    iii- After usage returns the Connection back to the pool.

    Note-
        => We take the support of vector<E>  to constructor Connection Polling Process.
        => This vector<E> organizes elements in sequence.
        => Vector<E> is synchronized class and Thread-Safe class.

Hierarchy of Vector<E>:
    =>  Iterable<E>(I) --> Collection<E>(I) --> List<E>(I) --> Vector<E>(c) --> Stack<E>(c)
 */

import  java.sql.*;
import  java.util.*;

class CP{
    public String url ,name,pwd;

    public CP(String url, String name, String pwd) {
        this.url = url;
        this.name = name;
        this.pwd = pwd;
    }

    public Vector<Connection> v = new Vector<Connection>(); // a vector is hold a Connection object
    public synchronized   void  createConnection(){
        try {
            while (v.size() < 5){
                System.out.println("Connection pool is not full...");
                Connection con = DriverManager.getConnection(url,name,pwd);
                v.add(con); // adding the connection to vector object (or Pool)
                System.out.println(con);
            }
            if (v.size() == 5){
                System.out.println("Connection is full...");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public synchronized Connection useConnection(){
        Connection con = v.firstElement(); // First connection is taken
        v.remove(0); // one connection at index 0 is deleted
        return con;
    }
    public synchronized  void  returnConnection(Connection con){
        v.addElement(con); // adding connection back to the pool.
        System.out.println("Connection return back to the pool...");
    }

}

public class Connection_Polling {
    public static void main(String[] args) {
        CP c = new CP("jdbc:oracle:thin:@localhost:1521:orcl","MYDB","MYDB");
        c.createConnection();
        System.out.println("Pool size: "+c.v.size());
        Connection con = c.useConnection();
        System.out.println("User using : "+con);
        System.out.println("After taking user a connection pool size: "+c.v.size());
        c.returnConnection(con);
        System.out.println("After return the connection the pool size :"+c.v.size());
        System.out.println("-----Display the connection from pool-------");
//        System.out.println(c.v);
        c.v.forEach((k)->{
            System.out.println(k);
        });
    }
}
