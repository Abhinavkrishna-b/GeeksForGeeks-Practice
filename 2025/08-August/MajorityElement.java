//17-08-25
import java.util.*;
class MajorityElementSolution{
    public static int majorityElement(int arr[]){
        int majority=arr[0];
        int majorityCount=1;
        for(int i=1;i<arr.length;i++){
            if(majorityCount == 0){
                majority=arr[i];
                majorityCount=1;
                continue;
            }
            if(arr[i]==majority){
                majorityCount++;
            }
            else{
                majorityCount--;
            }
        }
        int count = 0;
        for (int num : arr) {
            if (num == majority) count++;
        }

        if (count > arr.length / 2) {
            return majority;
        } else {
            return -1;  // no majority element
        }
    }
}
public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = MajorityElementSolution.majorityElement(arr);
        if (result != -1) {
            System.out.println("Majority Element is: " + result);
        } else {
            System.out.println("No Majority Element found");
        }
        sc.close();
    }
}
//Time- O(n) Space- O(1)