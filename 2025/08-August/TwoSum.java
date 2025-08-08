//08-08-25
import java.util.*;

class Solution{
    public static boolean twoSum(int nums[],int target){
        //Here i m only return the boolen whether the array has the elements that sum to targetSum or not so i didn't used hashMap
        HashSet<Integer> seen = new HashSet<>();
        int needed;
        for(int num:nums){
            needed = target-num;//-3+1=-2 =>-2+3=1 => target=nums[i]+nums[j] => target-nums[i]=nums[j]
            if(seen.contains(needed)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}

public class TwoSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of input array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the values: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target value: ");
        int targetSum=sc.nextInt();

        boolean isTargetSumPresent = Solution.twoSum(arr,targetSum);

        if(isTargetSumPresent) System.out.println("The array contains two element whose sum is equal to: "+ targetSum);
        else System.out.println("The array does not contains two element whose sum is equal to: "+ targetSum);

        sc.close();
    }
}
//Time- O(n) Space- O(n)
//arr=[11] target=11 => This returns false