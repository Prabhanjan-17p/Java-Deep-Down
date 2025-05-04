package Class_Program;

/*
Types of ResultSet objects:
    =>Based on control over the cursor, the ResultSet objects are categorized into two types:
        1. Non-Scrollable ResultSet object
        2. Scrollable ResultSet object

    1. Non-Scr011ab1e ResultSet object:
        => Non-Scrollable ResultSet Objects the cursor is moved only in one direction,which means the cursor moves from top-of-the-table-data Bottom-of-table-data.
        Ex: above programs related to ResultSet

    2. Scrollable ResultSet object:
        => Scrollable ResultSet object the cursor can be moved in two directions,which means down the table data and upward the table data.

    Syntax for Creating Scrollable ResultSet object:
        => Statement stm = con.createStatement (type , mode ) ;
        => PreparedStatement ps = con.prepareStatement( "query-S " , type, mode) ;

    Type :(Direction of the data)
        public static final int TYPE_FORWARD ONLY=1003
        public static final int TYPE_SCROLL_INSENSITIVE=1004
        public static final int TYPE_SCROLL_SENSITIVE=1005

    Mode :(Operation on the data)
        public static final int CONCUR_READ ONLY=1ØØ7
        public static final int CONCUR_UPDATABLE=1ØØ8

    Note :
        => 'type' specifies the direction of the cursor and 'mode' specifies the action to be performed(read or update).

    The following are some Methods ResultSet object:
        - afterLast() => the cursor used to control cursor on Scrollable after the Last row
        - beforeFirst() => the cursor before the First row
        - previous() => the Cursor in the BackWard Direction
        - next() => Moves the cursor in the ForWard Direction
        - first() => Moves the cursor to the First row
        - last() => Moves the cursor to the Last row
        - absolute(int) => Moves the cursor to the specified row number
        - relative(int) => Moves the cursor from the current position in forward or backward direction by increment or decrement.

    define 'RowSet' ?
        =>RowSet object will encapsulate the rows generated from ResultSets any other data sources.
        => RowSet is an interface from javax.sql package and which is extends java.sq1.ResultSet' interface.
 */


import java.sql.*;


public class Type_Of_ResultSet {
    public static void main(String[] args) {
        try {
            //Case 1 : Statement
            /*
            Connection con = DriverManager.getConnection
                    ( "jdbc:oracle:thin:@localhost:1521/orcl", "MYDB", "MYDB");
            Statement stm =  con.createStatement
                    (ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

            ResultSet rs = stm.executeQuery("Select * from product45");

            System.out.println("---------Display Product In Reverse----------");
            rs.afterLast();  // Cursor pointing after last row
            while (rs.previous()){
                System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getInt(4));
            }

            System.out.println("---------Display Product In Forward----------");
            rs.beforeFirst();  // Cursor pointing after First row
            while (rs.next()){
                System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getInt(4));
            }
            System.out.println("---------Display Product In A Particular Number----------");
            rs.absolute(3);  // Cursor pointing a particular position
            while (rs.next()){
                System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getInt(4));
            }
             */

            //Case 2: Prepare Statement
            Connection con = DriverManager.getConnection
                    ( "jdbc:oracle:thin:@localhost:1521/orcl", "MYDB", "MYDB");
            PreparedStatement ps = con.prepareStatement
    ("Select * from product45",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = ps.executeQuery();
            System.out.println("---------Display Product In Reverse----------");
            rs.afterLast();  // Cursor pointing after last row
            while (rs.previous()){
                System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getInt(4));
            }

            System.out.println("---------Display Product Last Row----------");
            rs.last(); // the Cursor pointing to the last row
            System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getInt(4));

            System.out.println("---------Display Product First Row----------");
            rs.first(); // Moving the cursor into last row
            System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getInt(4));

            System.out.println("---------Display Product Particular Row----------");
            rs.absolute(4); //Cursor going to a particular row which is : 4
            System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getInt(4));

            System.out.println("---------Display Relative of +1 (Means current cursor position + 1)----------");
            rs.relative(1);
            System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getInt(4));


            //34
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
