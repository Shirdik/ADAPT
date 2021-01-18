class BubbleSort{

    public static int[] bubbleSort(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<(n-i);j++)
            {
                if(arr[j-1]>arr[j])
                {
                    int x=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=x;
                }
            }
        }
        return arr;
    }
}
public class Assignment1Q8 extends BubbleSort{
    public static void main(String args[]) {
        int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int x[]=bubbleSort(arr);
        for(int i:x)
        System.out.print(" "+i);
    }
}