
package Form;


public class UserID { 
    private static String kd; 
    public static void setUserLogin(String kode) { 
    UserID.kd  = kode; 
    } 
public static String getUserLogin() { 
    return kd; 
    }
}