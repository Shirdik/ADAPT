import java.util.*;
import java.util.function.*;

public class Assignment4Q5 {
    static List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

    public static void main(String[] args) {
        System.out.println(processWords(list));
     }

    public static String processWords(List<String> list) {

        StringBuilder s= new StringBuilder();
       
        Consumer <List> firstLetter = l -> {
            Iterator<String> itr=list.iterator();
            while(itr.hasNext())
            {
                s.append(itr.next().charAt(0));
            }
        };
        firstLetter.accept(list);
        String x= s.toString();
        return x;
    
}}