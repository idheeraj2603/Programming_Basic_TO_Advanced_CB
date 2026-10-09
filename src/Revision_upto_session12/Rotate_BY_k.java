package Revision_upto_session12;

//[1 2 3 4 5 6 7 8] ,k=3 [6 7 8 1 2 3 4 5]
import java.util.*;
public class Rotate_BY_k {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();// rotate by which?
        Rotate(arr,k);
        for(int i=0;i<arr.length;i++) // System.out.println(Arrays.toString(arr)); ye vi bas kar sakte h
        {
            System.out.println(arr[i]);
        }

//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.print(Rotate(arr[i]));
//        }
    }


    public static void Rotate(int[] arr, int k) {
        Reverse(arr, 0, arr.length - 1);
        Reverse(arr, 0, k - 1);
        Reverse(arr, k, arr.length - 1);
    }

    public static void Reverse(int[] arr, int i, int j)// abhi maine full array reverse kar diya now i will rotate it going to method rotate
    {
//    int i=0;
//    int j=arr.length-1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

