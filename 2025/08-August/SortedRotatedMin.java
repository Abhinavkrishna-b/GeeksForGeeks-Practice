import java.util.*;
public class SortedRotatedMin {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the array size: ");
    int n = sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the array value: ");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int min = Solution.findMin(arr);
    System.out.print("The min value is: "+ min);
    sc.close();
    }
}

class Solution{
    public static int findMin(int arr[]){
        //Binary Search
        int left=0,right=arr.length-1;
        int mid;
        while(left<right){
            mid=left+(right-left)/2;
            if(arr[mid]>arr[right]) left=mid+1;
            else right=mid;
        }
        return arr[left];
    }
}
//Time- O(logn) Space- O(1)