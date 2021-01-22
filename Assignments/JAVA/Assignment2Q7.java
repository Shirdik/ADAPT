import java.util.*;

abstract class DesertItem {

    abstract public int getCost();
}
class Candy extends DesertItem {
    int quant;
    public int addCandies(int candies){
        quant+=candies;
        return quant;
    }
    public int getCost()
    {
        return quant*60;
    }
}
class Cookie extends DesertItem {
    int quant;
    public int addCookies(int candies){
        quant+=candies;
        return quant;
    }
    public int getCost(){
        return quant*70;
    }
}
class IceCream extends DesertItem {
    int quant;
    public int addIceCreams(int candies){
        quant+=candies;
        return quant;
    }
    public int getCost()
    {
        return quant*10;
    }
}
public class Assignment2Q7 {
    public static void main(String[] args) {
        Assignment2Q7 obj= new Assignment2Q7();
        obj.selectRoles();
    }
    private void selectRoles(){
        Scanner in = new Scanner(System.in);
        System.out.println("Select Roles: \n1.Owner\n2.Customer");
        int x=0;
        x=in.nextInt();
        if(x==1)
        roles("Owner");
        else
        roles("Customer");
    }
    private void roles(String role){
        if(role.equals("Owner"))
        addItems();
        else
        placeOrder();
    }
    private void addItems() {
        System.out.println("Add Items: \n1.Candy\n2.Cookie\n3.IceCream");
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        addItemsOperation(x);
    }
    private void addItemsOperation(int choice) {
        if(choice==1)
        {
            Candy x= new Candy();
            Scanner in = new Scanner(System.in);
            System.out.println("Quantity to be added:");
            int candies=in.nextInt();
            x.addCandies(candies);
            System.out.println("Total Quantity "+x.quant);
        }
        else if(choice ==2)
        {
            Cookie x= new Cookie();
            Scanner in = new Scanner(System.in);
            System.out.println("Quantity to be added:");
            int candies=in.nextInt();
            x.addCookies(candies);
            System.out.println("Total Quantity "+x.quant);
        }
        else
        {
            IceCream x= new IceCream();
            Scanner in = new Scanner(System.in);
            System.out.println("Quantity to be added:");
            int candies=in.nextInt();
            x.addIceCreams(candies);
            System.out.println("Total Quantity "+x.quant);
        }
    }
    private void placeOrder() {
        System.out.println("Add Items: \n1.Candy\n2.Cookie\n3.IceCream");
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        placeOrderOperation(x);
    }
    private void placeOrderOperation(int choice) {
        if(choice==1)
        {
            Candy x= new Candy();
            Scanner in = new Scanner(System.in);
            System.out.println("Quantity to be added:");
            int candies=in.nextInt();
            x.addCandies(candies);
            System.out.println("Total Amount: "+x.getCost());
        }
        else if(choice ==2)
        {
            Cookie x= new Cookie();
            Scanner in = new Scanner(System.in);
            System.out.println("Quantity to be added:");
            int candies=in.nextInt();
            x.addCookies(candies);
            System.out.println("Total Amount: "+x.getCost());
        }
        else
        {
            IceCream x= new IceCream();
            Scanner in = new Scanner(System.in);
            System.out.println("Quantity to be added:");
            int candies=in.nextInt();
            x.addIceCreams(candies);
            System.out.println("Total Amount: "+x.getCost());
        }
    }
}