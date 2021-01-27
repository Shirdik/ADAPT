import java.util.function.*;

public class Assignment4Q3{

    static void display(Supplier<Integer> arg) {
        System.out.println(arg.get());
    }
    static class Product {
        private double price = 0.0;
      
        public void setPrice(double price) {
          this.price = price;
        }
      
        public void printPrice() {
          System.out.println(price);
        }
    }
    public static void main(String[] args) {
        //Predicate
        Predicate<String> isALongWord = t -> t.length() > 10;
        String s = "successfully";
        boolean result = isALongWord.test(s);
        System.out.println(result);

        //Consumer
        Consumer<Product> updatePrice = p -> p.setPrice(5.9);
        Product p = new Product();
        updatePrice.accept(p);
        p.printPrice();

        //Supplier
        int n = 3;
        display(() -> n + 10);
        display(() -> n + 100);

}}