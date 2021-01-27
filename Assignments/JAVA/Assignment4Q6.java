import java.util.ArrayList;
import java.util.function.UnaryOperator;


public class Assignment4Q6 {
    public static void main(String[] args) {

        String s1="a";
        String s2="b";
        String s3="c";
        String s4="d";
        String s5="e";

        ArrayList<String> list= new ArrayList<>();;
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        
        list.forEach(System.out::println);
        convertToUpperCase(list);
        list.forEach(System.out::println);
        
    }

    static class operator implements UnaryOperator<String>
    {
        @Override
        public String apply(String t)
        {
           return t.toUpperCase();
        }
    }
    public static  ArrayList<String> convertToUpperCase(ArrayList<String> list) {
        list.replaceAll(new operator());
        return list;
    }  
}