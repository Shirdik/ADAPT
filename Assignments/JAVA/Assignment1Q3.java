import java.lang.Math;
class SiCi
{
    public static double simpleInterest(double principalAmount,int time,double interestRate)
    {
        return ((principalAmount*time*interestRate)/100);
    }
    public static double compoundInterest(double principalAmount,int time,double interestRate)
    {
        double x=Math.pow(1+interestRate,time);
        return principalAmount*x-principalAmount;
    }
}

public class Assignment1Q3 extends SiCi
{
    public static void main(String...args)
    {
        System.out.println(simpleInterest(1000.0, 2, 10.0));
        System.out.println(compoundInterest(1000.0,2,10.0));
    }

   
}
