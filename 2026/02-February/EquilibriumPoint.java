//18-02-26
import java.util.*;

public class EquilibriumPoint {
    public static int findEquilibrium(int arr[]) {
        // code here
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            
            if (leftSum == rightSum) {
                return i;
            }
            
            leftSum += arr[i];
        }
        
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int equilibriumIndex = findEquilibrium(arr);
        if (equilibriumIndex != -1) {
            System.out.println("Equilibrium point is at index: " + equilibriumIndex);
        } else {
            System.out.println("No equilibrium point found.");
        }
        sc.close();
    }
}
//Time- O(2n) ~ O(n)
//Space- O(1)