package Class_Program;

import javax.sql.RowSet;

/*
** Define 'RowSet' ?
        => RowSet object will encapsulate the rows generated from ResultSets any other data sources.
        => RowSet is an interface from 'javax.sql' package and which is extends 'java.sql.ResultSet' interface.

Following are the interfaces extended from RowSet:
    (a) JDBCRowSet
    (b) CachedRowSet
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

    }
}
