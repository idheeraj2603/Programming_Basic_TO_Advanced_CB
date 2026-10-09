package Coding_B_Array;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr={5,3,-7,4,8,2};
        SelectionSort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void SelectionSort(int[]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int idx=minidx(arr,i);
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
        }
    }
    public static int minidx(int[]arr,int i)
    {
        int min=i;
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[j]<arr[min])
            {
                min=j;
            }
        }
        return min;
    }

}
