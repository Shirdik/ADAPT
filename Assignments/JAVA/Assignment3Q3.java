import java.util.*;
public class Assignment3Q3 {
    public static List traverseReverse(ArrayList aList){
        Collections.reverse(aList);
        return aList;
    }
    public static void main(String[] args) {
        ArrayList<String> aList= new ArrayList<>();
        aList.add("Shirdi");
        aList.add("Chandrika");
        aList.add("Venkat");
        aList.add("Ganga"); 
        System.out.println(aList);
        System.out.println("---------------------------------------");
        System.out.println(traverseReverse(aList));
    }
    
}

