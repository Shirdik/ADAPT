interface x
{
    void oper();
}
public class Assignment4Q1{

    public void addition(int num1,int num2){
        x a=()->System.out.println(num1+num2);
        a.oper();
    }
    public void subtraction(int num1,int num2){
        x a=()->System.out.println(num1-num2);
        a.oper();
    }
    public void multiplication(int num1,int num2){
        x a=()->System.out.println(num1*num2);
        a.oper();
    }
    public void division(int num1,int num2){
        x a=()->System.out.println(num1/num2);
        a.oper();
    }   
    public static void main(String[] args) {
        Assignment4Q1 a= new Assignment4Q1();
        a.addition(13,5);
        a.subtraction(13,5);
        a.multiplication(13,5);
        a.division(13,5);
     
    }
}