abstract class one{

    abstract public void fun1();
    public void fun2()
    {
        System.out.println("Fun2 from class one");
    }
}

public class Assignment2Q4 extends one{
    public void fun1() {
        System.out.println("Fun1 is overided");
    }
    public static void main(String[] args) {

        Assignment2Q4 obj = new Assignment2Q4();
        obj.fun1();
        obj.fun2();
    }
    
}
