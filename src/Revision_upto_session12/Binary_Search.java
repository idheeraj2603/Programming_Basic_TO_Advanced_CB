package Revision_upto_session12;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr={4,5,7,8,10,42,56};
        int item=10;
        System.out.println(Search(arr,item));
    }
    public static int Search(int[] arr,int k)
    {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==k)
            {
                return mid;
            }
            else if(arr[mid]>=k)
            {
               high=mid-1;
            }
            else
            {
               low=mid+1;
            }
        }
        return -1;
    }
}
