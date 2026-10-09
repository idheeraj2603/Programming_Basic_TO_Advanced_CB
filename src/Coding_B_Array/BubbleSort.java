package Coding_B_Array;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={4,5,3,2,1};
        Sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
    public static void Sort(int[]arr)
    {
        for(int turn=1;turn<arr.length;turn++ )
        {
            for(int i=0;i<arr.length-turn;i++) //yaha length-turn isliye kar rhe h bcz i dont want to check elelment that is sorted already faltu ka loop kyu chalana
            {
                if(arr[i]>arr[i+1])
                {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }


}
