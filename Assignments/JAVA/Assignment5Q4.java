import java.util.*;

class Trader {
    private String name;
    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Trader [city=" + city + ", name=" + name + "]";
    }
}

class Transaction {
    private Trader trader;
    private int year;
    private int value;

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Trader getTrader() {
        return trader;
    }

    public void setTrader(Trader trader) {
        this.trader = trader;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Transaction [trader=" + trader + ", value=" + value + ", year=" + year + "]";
    }

    
}
public class Assignment5Q4 {
    public static ArrayList<Transaction> sortTransactions(ArrayList <Transaction> transactions) {
        Collections.sort(transactions,(t1,t2)->t1.getValue()>t2.getValue()?1:-1);
        ArrayList<Transaction> list = new ArrayList<>();
        for(Transaction x:transactions)
        {
            if(x.getYear()==2011)
            list.add(x);
        }
        return list;
    }

    public static ArrayList<Integer> transactionsValuesDelhi(ArrayList<Transaction> transactions) {
        ArrayList<Integer> list = new ArrayList<>();
        for(Transaction x: transactions)
        {
            if(x.getTrader().getCity().equals("DELHI"))
            list.add(x.getValue());
        }
        return list;
    }
    public static int highestTransaction(ArrayList<Transaction> transactions){
        int max=0;
        for(Transaction x: transactions)
        {
            if(max<x.getValue())
            max=x.getValue();
        }
        return max;
    }

    public static int smallestTransaction(ArrayList<Transaction> transactions){
        int max=9999999;
        for(Transaction x: transactions)
        {
            if(max>x.getValue())
            max=x.getValue();
        }
        return max;
    }

    public static void main(String[] args) {
        Trader t1= new Trader("Shirdi", "PUNE");
        Trader t2= new Trader("Chandrika", "INDORE");
        Trader t3= new Trader("Keshav", "DELHI");
        Trader t4= new Trader("Ganga", "PUNE");
        Trader t5= new Trader("Venkat", "INDORE");
        Trader t6= new Trader("Sailesh", "DELHI");
        Transaction s1= new Transaction(t1, 2011, 10000);
        Transaction s2= new Transaction(t1, 2014, 100231);
        Transaction s3= new Transaction(t2, 2012, 10001);
        Transaction s4= new Transaction(t4, 2011, 100004);
        Transaction s5= new Transaction(t3, 2011, 100030);
        Transaction s6= new Transaction(t5, 2016, 1000);
        Transaction s7= new Transaction(t6, 2012, 100000);

        ArrayList<Transaction> transactions= new ArrayList<>();
        transactions.add(s1);
        transactions.add(s2);
        transactions.add(s3);
        transactions.add(s4);
        transactions.add(s5);
        transactions.add(s6);
        transactions.add(s7);

        System.out.println(sortTransactions(transactions));
        System.out.println(transactionsValuesDelhi(transactions));
        System.out.println(highestTransaction(transactions));
        System.out.println(smallestTransaction(transactions));
    }
}