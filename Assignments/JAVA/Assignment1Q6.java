import java.util.*;
class Login{
    public static int i=0;
    static String userId = "Ajay",password = "password";
    public static String loginUser(String user, String pass) {
        if(user.equals(userId) && pass.equals(password))
        return "Yes";
        return "No";
    }

}
public class Assignment1Q6 extends Login{
    public static void main(String[] args) {
        // Login x= new Login();
        Scanner in = new Scanner(System.in);
        String user,pass;
        while(i<3)
        {
        user=in.nextLine();
        pass=in.nextLine();
        String s=loginUser(user,pass);
        if(s.equals("Yes"))
        {
            System.out.println("Welcome "+user);
            break;
        }
        else{
            System.out.println("Wrong Password, Please enter again");
        }
        i++;
        }
        if(i==3)
        System.out.println("Contact Admin");
            
        }
    }
