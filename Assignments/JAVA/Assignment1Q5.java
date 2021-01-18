import java.util.*;
class TaxAmount{
    public static double calculateTaxAmount(int ctc)
    {
        if(ctc<180001)  return 0;
        else if(ctc < 300001)   return ctc/10;   
        else if(ctc < 500001)   return ctc/20;
        else if(ctc < 1000001)  return ctc/30;
        else return -1;
    }
}
public class Assignment1Q5 extends  TaxAmount{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int ctc=in.nextInt();
        System.out.println(calculateTaxAmount(ctc));
    }
}

