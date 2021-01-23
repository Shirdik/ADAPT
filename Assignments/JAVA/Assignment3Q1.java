import java.util.*;

class Person{
    private String name;
    private int height;
    private double weight;
    Person(String name, int height, double weight)
    {
        this.name=name;
        this.height=height;
        this.weight=weight;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

}

class weightComp implements Comparator<Person>{
    
    @Override
    public int compare(Person p1, Person p2)
    {
        if(p1.getWeight()==p2.getWeight())
        {
            if(p1.getHeight()>p2.getHeight())
                return 1;
            else 
                return -1;
        }
        else
        {
            if(p1.getWeight()>p2.getWeight())
            return 1;
            else
            return -1;
        }
    
    }
}

public class Assignment3Q1 {
    public static void main(String[] args) {

        Set<Person> set=new TreeSet<>(new weightComp());       
        set.add(new Person("Shirdi",5,75));
        set.add(new Person("Chandrika",7,65));
        set.add(new Person("Ganga",6,65));
        set.add(new Person("Venkat",7,80));
        for(Person p:set)
        System.out.println(p.getName());
    }
}