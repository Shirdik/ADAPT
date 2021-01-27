import java.util.ArrayList;
interface x{
    void oper();
}

public class Assignment4Q2 {

    private int totalPrice;
    private String status;

    
    public static void listOfOrders(ArrayList<Assignment4Q2> orders) {
        x a;
        a= ()->orders.forEach(System.out::println);
        a.oper();
    }
    public static void main(String[] args) {
        Assignment4Q2 o1= new Assignment4Q2(100,"ACCEPTED");
        Assignment4Q2 o2= new Assignment4Q2(90,"ACCEPTED");
        Assignment4Q2 o3= new Assignment4Q2(10,"COMPLETED");
        Assignment4Q2 o4= new Assignment4Q2(50,"ACCEPTED");
        Assignment4Q2 o5= new Assignment4Q2(500,"COMPLETED");
        ArrayList<Assignment4Q2> list= new ArrayList<>();
        list.add(o1);
        list.add(o2);
        list.add(o3);
        list.add(o4);
        list.add(o5);
        Assignment4Q2.listOfOrders(list);
    }

    public Assignment4Q2(int totalPrice, String status) {
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString()
    {
       return("Amount : "+totalPrice+"\n Status : "+status);
    }
}