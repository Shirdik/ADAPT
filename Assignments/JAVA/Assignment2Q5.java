class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
        return "Redctangle";
    }
}

class Line5 extends Shape5{
    @Override
    public String draw() {
        return "Line";
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
        return "Cube";
    }
}
abstract class Shape5 {
    abstract public String draw();
}
public class Assignment2Q5{
    public static void main(String[] args) {
        Rectangle5 s1= new Rectangle5();
        Line5 s2= new Line5();
        Cube5 s3= new Cube5();
        System.out.println(s1.draw());
        System.out.println(s2.draw());
        System.out.println(s3.draw()); 
    }
}