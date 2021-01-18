class ArmstrongOrNot
{
    public static boolean armstrongCheck(int num)
    {
        int n=num, x=0, sum=0;
        while(num>0)
        {
            x=num%10;
            num=num/10;
            sum+=x*x*x;
        }
        return (sum==n);
    }
}
public class Assignment1Q2 extends ArmstrongOrNot
{
    public static void main (String...args)
    {
        
        for(int x=100;x<999;x++)
        {
            if(armstrongCheck(x))
            System.out.println(x);
        }
    }

}