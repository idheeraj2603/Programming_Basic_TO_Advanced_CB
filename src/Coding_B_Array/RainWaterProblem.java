package Coding_B_Array;
import java.util.*;
public class RainWaterProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(RainTrap(arr));


    }

    public static int RainTrap(int[]arr) {
        int n = arr.length;
        int[] left = new int[n];
        left[0] = arr[0];
        for (int i = 1; i < left.length; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }

        int[] right = new int[n];
        right[right.length - 1] = arr[arr.length - 1];

        for (int i = right.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }
        int sum=0;
        for(int i=0;i<right.length;i++)
        {
            sum=sum+Math.min(left[i],right[i])-arr[i];
        }
        return sum;
    }// abhi left right array ban chuka h
 }
