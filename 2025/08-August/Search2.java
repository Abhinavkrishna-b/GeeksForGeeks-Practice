//19-08-25
import java.util.*;
class Search2Solution{
    public int search(int[] arr, int k) {
        //Binary Search
        int left = 0;
        int right = arr.length - 1;
        int result=-1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == k) {
            result=mid;
            right=mid-1;
            } else if (arr[mid] < k) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        
        return result;
    }
}
public class Search2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        n = sc.nextInt();
        int arr[] = new int[n];     
        System.out.println("Enter the values: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int x = sc.nextInt();

        Search2Solution search2 = new Search2Solution();
        int result = search2.search(arr, x);
        
        if (result == -1)
            System.out.print("Element is not in the array");
        else
            System.out.print("Element is at the index " + result);
        
        sc.close();
    }
}
//Time- O(log n) Space- O(1)