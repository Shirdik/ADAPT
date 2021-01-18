import org.graalvm.compiler.lir.asm.CompilationResultBuilder.AssemblerAnnotation;

class ArmstrongOrNot
{
    int x;
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
public class AssignmentQ1 extends ArmstrongOrNot
{
    public static void main (String...args)
    {
        ArmstrongOrNot first = new ArmstrongOrNot();
            first.x=371;
            System.out.println(armstrongCheck(first.x));
    }

}