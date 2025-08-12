//12-08-25
//Kadane's Algorithm
import java.util.*;
class KadanesAlgorithmSolution{
    public static int maxSubarraySum(int nums[]){
        if(nums.length==0)  return 0;
        int maxSum = nums[0];
        int curSum=0;
        for(int i=0;i<nums.length;i++){
            if(curSum<0)    curSum=0;
            curSum+=nums[i];
            maxSum=Math.max(curSum,maxSum);
        }
        return maxSum;
    }
}
public class KadanesAlgorithm {
    public static void main(String[] args) {
    System.out.println("Enter the size of the array: ");
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the values: ");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int sum = KadanesAlgorithmSolution.maxSubarraySum(arr);
    System.out.println("The sum of the maximum subarray is "+ sum);
    sc.close();
    }
}//Time- O(n) Space- O(1)