import java.util.*;

abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
        return "Persist in File";
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
        return "Persists in Database";
    }
}

public class Assignment2Q6 {
    public static void main(String[] args) {
        Random rand= new Random();
        int x=rand.nextInt(1000);
        if(x%2==0)
        {
            FilePersistence f= new FilePersistence();
            System.out.println(f.persist());
        }
        else
        {
            DatabasePersistence f = new DatabasePersistence();
            System.out.println(f.persist());
            
        }
    }
}