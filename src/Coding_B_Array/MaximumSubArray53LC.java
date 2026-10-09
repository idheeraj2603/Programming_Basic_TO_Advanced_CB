package Coding_B_Array;
import java.util.*;

public class MaximumSubArray53LC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]  //Output: 6
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(MaxArray(arr));

    }
    public static int MaxArray(int[] arr)
    {
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {   int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum=sum+arr[j];
                ans=Math.max(ans,sum);
            }
        }
        return ans;
    }
}
