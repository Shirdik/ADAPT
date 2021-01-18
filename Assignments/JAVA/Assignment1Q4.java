class ResultDeclaration{
    public static String declareResults( double subject1Marks, double subject2Marks, double subject3Marks)
     {
         double x=subject1Marks,y=subject2Marks,z=subject3Marks;
        if(x>60 && y>60 && z>60)    return "Passed";
        else if (x<60 || y<60 || z<60) return "Promoted";
        else return "Failed";
     }
}
public class Assignment1Q4 extends ResultDeclaration{
    public static void main(String[] args) 
    {
        System.out.println(declareResults(87.2,61,67));
    }
}