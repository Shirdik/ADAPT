import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Chatroom{
    private String name;
    private Set<String> username;
    private List<String> messages;

    {
        name = "";
        username = new HashSet<String>();
        messages = new ArrayList<String>();
    }
    public boolean removeUser(String username) {
    }
}

class User{

    private String username;
    private String password;
    private String firstName;
    private String lastName;

    public User(String username, String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    
}


class ChatApplication{

    private Map<String, Chatroom> chatrooms = new HashMap<String, Chatroom>();
    private Map<String, User> users = new HashMap<String, User>();
    private Set<String> loggedInUsers = new HashSet<String>();

    public boolean isChatroomNameValid(String name) {
        if(chatrooms.containsKey(name))
        return true;
        return false;
    }

    public boolean isUsernameExists(String username) {
        if(users.containsKey(username))
        return true;
        return false;
    }

    public boolean authenticateUser(String username, String password) {
        if()
    }

    //UI Methods Below
    public void createChatroom() {}

    public void addNewUser() {
        Scanner in= new Scanner(System.in);
        String username,password,firstname,lastname;
        System.out.println("-------------------------------------");
        System.out.println("---------New User Interface----------");
        System.out.println("-------------------------------------");
        System.out.println("Enter First name:\n");
        firstname=in.nextLine();
        System.out.println("Enter Last name:\n");
        lastname=in.nextLine();
        System.out.println("Enter Username:\n");
        username=in.nextLine();
        System.out.println("Enter Password:\n");
        password=in.nextLine();
        User x= new User(username,password,firstname,lastname);
        users.put(username,x);
    }

    public boolean login() {
        Scanner in= new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("------------Login Interface----------");
        System.out.println("-------------------------------------");
        String username,password;
        System.out.println("Enter Username:\n");
        username=in.nextLine();
        System.out.println("Enter Password:\n");
        password=in.nextLine();
        if(authenticateUser(username, password)==true)
        System.out.println("")
        
    }

    public void sendMessage() {}

    public void printMessages() {}

    public void listUsersFromChatroom() {}

    public void logout(){}

    public void deleteUser(){}


    public void menu() {}
}

public class Assignment3Q6{
    public static void main(String[] args){}
}