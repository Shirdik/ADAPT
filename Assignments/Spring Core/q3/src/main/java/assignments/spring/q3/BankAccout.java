package assignments.spring.q3;

import java.util.HashMap;

public class BankAccout {
 
    long accountId;
    String accountHolderName;
    String accountType;
    double accountBalance;
    static HashMap<Long,Double> acc;

    public long getAccoutId() {
        return accountId;
    }

    public void setAccoutId(long accountId) {
        this.accountId = accountId;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public BankAccout(long accountId, String accountHolderName, String accountType, double accountBalance) {
        this.accountId = accountId;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
        acc.put(accountId, accountBalance);
    }

    


}
