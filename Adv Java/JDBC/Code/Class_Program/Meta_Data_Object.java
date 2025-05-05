package Class_Program;

/*
define Metadata in JDBC?I
    =>Metadata means the data holding information about another data is Metadata.
    => According to Object Oriented programming,Metadata means one object information about another object.
    => The following are the metadata components from JDBC:
        1. DatabaseMetaData
        2. ParameterMetaData
        3. ResultSetMetaData
        4. RowSetMetaData

    1. DatabaseMetaData
        => DatabaseMetaData is an interface from java.sql package and which is used to hold information about "Connection Object".
        syntax :
        DatabaseMetaData dmd = con.getMetaData();

    2. ParameterMetaData
        => ParameterMetaData is an inter ace from java.sql package and which used to hold information about "PreparedStatement object".
        syntax :
        ParameterMetaData pmd = ps.getParameterMetaData();

    3. ResultSetMetaData
        => ResultSetMetaData is an interface from java. sql package and which used to hold the information about "ResultSet Object".
        syntax:
        ResultSetMetaData rsmd = rs.getMetaData();

    4. RowSetMetaData
        => RowSetMetaData is also an interface from java. sql package and which is used to hold information about "RowSet Object".
        syntax :
        RowSetMetaData rsmd = (RowSetMetaData)rs.getMetaData();

 */


public class Meta_Data_Object {
    public static void main(String[] args) {
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
