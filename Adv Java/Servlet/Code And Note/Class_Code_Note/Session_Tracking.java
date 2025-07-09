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
    Constructor:
        public Cookie(String , String );
            => It is used to create a cookie with name and value pair.
    Method:
        public void setMaxAge(int);
            => It is used to set the time interval in second.
        public int getMaxAge();
            => It is used to get the time interval in second.
        public java.lang.String getName();
            => It return name of the cookie.
        public void setValue(java.lang.String);
            => It is used to change the value of the cookie.
        public void getValue(java.lang.String);
            => It is used to get the value of the cookies.

    NOTE - by default cookie are vanished whenever browser window is closed.

    Method:(javax.servlet.HttpServletRequest/Response)
        public abstract void addCookie(Cookie);
            => It add the client system(response).
        public abstract Cookie[] getCookie();
            => It retrieve all the Cookie details(request) .









NOTE - If new Page open(Redirecting) then go for doGet()
     - If same Page forward then go for doPOST()

 */
public class Session_Tracking {
    public static void main(String[] args) {
        for (int i = 0; i <=2 ; ) {
            System.out.printf("dddd");
        }
        System.out.printf("ppp");
    }
}
