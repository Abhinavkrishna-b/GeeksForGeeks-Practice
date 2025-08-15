//15-08-25
import java.util.*;
class MaxSubarrayProductSolution {
        public static int maxProduct(int[] nums) {
        //Dynamic Programming
        int maxProduct = nums[0];
        int curMax=nums[0],curMin=nums[0];
        int tmp;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==0){
                curMax=1;
                curMin=1;
            }
            tmp=nums[i]*curMax;//we use the tmp coz curMax can be change and it may result in unexpected value in curMin
            curMax=Math.max(Math.max(curMax*nums[i],curMin*nums[i]),nums[i]);
            curMin=Math.min(Math.min(tmp,curMin*nums[i]),nums[i]);
            maxProduct=Math.max(maxProduct,curMax);//Math.max(curMax,curMin); this result in a bug note it.
        }
        return maxProduct;
    }
}
public class MaxSubarrayProduct {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxProduct = MaxSubarrayProductSolution.maxProduct(arr);
        System.out.println("The maximum product of a subarray is: " + maxProduct);
        sc.close();
    }
}
//Time- O(n) Space- O(1)