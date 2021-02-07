package assignments.spring.q4;

import org.springframework.stereotype.Repository;

@Repository
public class repository {
  public void show() 
  {
      System.out.println("Using repository, spring can auto-detect repo");
  }  
}
