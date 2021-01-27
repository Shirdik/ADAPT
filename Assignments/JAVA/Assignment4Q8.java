import java.util.function.Consumer;

public class Assignment4Q8 implements Runnable{  
    public void run(){  
      Consumer <Integer> f=(t)->{
        for(int i=0;i<t;i++)
        System.out.print(i);
      };
      f.accept(1000);
    }  
      
    public static void main(String args[]){  
    Assignment4Q8 m1=new Assignment4Q8();  
    Thread t1 =new Thread(m1);  
    t1.start();  
     }  
    }  