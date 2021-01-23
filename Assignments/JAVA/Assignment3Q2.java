import java.util.*;
public class Assignment3Q2 {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<String>();
        Set<String> linkedHashSet = new LinkedHashSet<String>();
        hashSet.add("Shirdi");
        hashSet.add("Chandrika");
        hashSet.add("Venkat");
        hashSet.add("Ganga");
        linkedHashSet.add("Shirdi");
        linkedHashSet.add("Chandrika");
        linkedHashSet.add("Venkat");
        linkedHashSet.add("Ganga"); 
        for(String x:hashSet)
        System.out.println(x);
        System.out.println("-----------------------------------");
        for(String x:linkedHashSet)
        System.out.println(x);

    }
}