import java.util.ArrayList;

public class Assignment4Q4 {
    public static ArrayList<String> removeOddLength(ArrayList<String> employeeList){
     employeeList.removeIf(n-> ((n.length())%3==0));
     return employeeList;
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        removeOddLength(list);
        list.forEach(System.out::println);
     }
}