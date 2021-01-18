import java.util.*;
class Login{
    static String userId = "Ajay";
    static String password = "password";
    public static String loginUser(String user, String pass)
    {
        if(user.equals(userId) && pass.equals(password))  
        return ("Welcome "+userId);
        else 
        return ("You have entered wrong credentials ,please enter the right credentials");
    }

}
public class Assignment1Q6 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String user,pass;
        int chance=3;
        while(chance--)
        {
            user=in.nextLine();
            pass=in.nextLine();
            String    
        }
    }
}