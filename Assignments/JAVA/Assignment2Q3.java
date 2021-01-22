import java.util.ArrayList;

import javax.security.auth.callback.TextOutputCallback;

class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {
        return totalDeposits+creditLimit;
    }
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {
        return totalDeposits+fixedDepositAmount;
    }
}
public class Assignment2Q3 {
    public static int totalCashInBank(ArrayList<Integer> cash){
        int TotalCash=0;
        for(int x:cash)
        {
            TotalCash+=x;
        }
        return TotalCash;
    }
    public int getCash(){
    return 0;
    }
    public static void main(String[] args) {
        ArrayList<Integer> cash= new ArrayList<Integer>();
        Assignment2Q3 sa= new SavingsAccount();
        Assignment2Q3 ca= new CurrentAccount();
        cash.add(sa.getCash());
        cash.add(ca.getCash());
        System.out.println(totalCashInBank(cash));
        

    }
}