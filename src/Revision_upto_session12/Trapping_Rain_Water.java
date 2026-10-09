package Revision_upto_session12;
import java.util.*;

public class Trapping_Rain_Water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Trapping(arr));

    }
    public static int Trapping(int[] arr)
    {
        int n=arr.length;
        int [] left=new int[n];
        left[0]=arr[0];
        int [] right=new int[n];
        right[n-1]=arr[n-1];

        for(int i=1;i<left.length;i++)
        {
          left[i]=Math.max(left[i-1],arr[i]);
        }

        for(int i=right.length-2;i>=0;i--)
        {
           right[i]=Math.max(right[i+1],arr[i]);
        }
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+(Math.min(left[i],right[i])-arr[i]);

        }
        return sum;
    }
}
