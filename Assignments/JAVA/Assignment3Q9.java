import java.util.*;
class SavingAccount {

    private double acc_balance;
    private int acc_ID;
    private String accountHolderName;
    private boolean isSalaryAccount;

    public double getAcc_balance() {
        return acc_balance;
    }

    public void setAcc_balance(double acc_balance) {
        this.acc_balance = acc_balance;
    }

    public int getAcc_ID() {
        return acc_ID;
    }

    public void setAcc_ID(int acc_ID) {
        this.acc_ID = acc_ID;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public boolean isSalaryAccount() {
        return isSalaryAccount;
    }

    public void setSalaryAccount(boolean isSalaryAccount) {
        this.isSalaryAccount = isSalaryAccount;
    }

    public double withdraw(double x) {
        if(acc_balance<x)
        return -1;
        else
        {
            acc_balance-=x;
            return acc_balance;
        }
    }
    
    public double deposit(double x)
    {
        acc_balance+=x;
        return acc_balance;
    }

    public SavingAccount(double acc_balance, int acc_ID, String accountHolderName, boolean isSalaryAccount) {
        this.acc_balance = acc_balance;
        this.acc_ID = acc_ID;
        this.accountHolderName = accountHolderName;
        this.isSalaryAccount = isSalaryAccount;
    }
    
}

class myComp implements Comparator<SavingAccount>
{
    @Override
    public int compare(SavingAccount s1,SavingAccount s2)
    {
        if(s1.getAcc_ID()<s2.getAcc_ID())
        return 1;
        return -1;
    }
}

class BankAccountList{

    private TreeSet<SavingAccount> savingAccounts = new TreeSet<>(new myComp());

    public boolean addSavingAccount(SavingAccount savingAccount) {
           savingAccounts.add(savingAccount);
           return true;
    }

    public List<Integer> displaySavingAccountIds() {
        List <Integer> list =new ArrayList<>();
        for(SavingAccount x:savingAccounts)
        {
            System.out.println(x.getAcc_ID());
            list.add(x.getAcc_ID());
        }
        return list;
    }
}

public class Assignment3Q9 {
    public static void main(String[] args) {
        SavingAccount s1= new SavingAccount(1000, 1,"Shirdi",true);
        SavingAccount s2= new SavingAccount(1050, 2,"Chandrika",true);
        SavingAccount s3= new SavingAccount(1120, 3,"Ganga",true);
        SavingAccount s4= new SavingAccount(10012, 4,"Venkat",true);
        BankAccountList a1= new BankAccountList();
        a1.addSavingAccount(s1);
        a1.addSavingAccount(s2);
        a1.addSavingAccount(s3);
        a1.addSavingAccount(s4);
        List<Integer> Acclist = new ArrayList<>();
        Acclist.addAll(a1.displaySavingAccountIds());
        // System.out.println(Acclist);
    }
}