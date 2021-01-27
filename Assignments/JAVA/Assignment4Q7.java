import java.util.*;


public class Assignment4Q7 {
    public static void main(String[] args) {
        HashMap<String, Integer> map= new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 5);
        System.out.println(convertKeyValueToString(map));
    }
    public static String convertKeyValueToString(HashMap<String, Integer> map) {

        Set pair=map.entrySet();
        StringBuilder s= new StringBuilder();
        Iterator itr = pair.iterator();
        while(itr.hasNext())
        {
            s.append(itr.next());
        }
        String x= s.toString();
        return x;
    }
}