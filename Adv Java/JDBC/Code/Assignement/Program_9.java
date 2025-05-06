package Assignement;

import java.sql.Connection;
import java.sql.DriverManager;

public class Program_9 {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "MYDB", "MYDB" );
            /*
  4  INSERT INTO NITCOURSEDB VALUES(CNAME,DURATION,CFEE,FACULTY);
  5  INSERT INTO NITSTUDENTDB VALUES(SNAME,AGE,SID,SCOURSENAME,SFEE,BATCH);
             */
            String eName = "Hari Krishan";
            String eID = "NIT001";
            int eYoe = 23;
            String eSubject = "Java";

            String cName = "Java";
            int  cDur = 6;
            int cFee = 30000;
            String cFac = "Hari Krishan";

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
