package Class_Code_Note;
/*
Session Tracking
-------------------
    - A session is a time period between login and logout.
    - A session tracking is mechanism that servlet used to maintain client state information about a series of request from the same user across some time period.
    - Client State information can be user name, password, examination id, shopping item, account number ,---- etc.
    - HTTP protocol is a stateless protocol and it dose not maintain client state information. So we request this mechanism to maintain client state information.

    There are 4 type of Session Tracking methods:
    --------------------------------------------
    1) Cookies.
    2) Url Rewriting
    3) Http session
    4) Hidden form fields.
1) Cookies.
--------------
     - A Cookies is a piece of information stored at client side to maintain client state information.(Client Side Data Maintain)


NOTE - If new Page open(Redirecting) then go for doGet()
     - If same Page forward then go for doPOST()

 */
public class Session_Tracking {
    public static void main(String[] args) {

    }
}
