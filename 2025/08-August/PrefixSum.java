//25-08-25
import java.util.*;
class PrefixSumSolution{
    public ArrayList<Integer> prefSum(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> prefixSum = new ArrayList<>();
        prefixSum.add(arr[0]);
        for (int i = 1; i < n; i++)
            prefixSum.add(prefixSum.get(i - 1) + arr[i]);
        return prefixSum;
    }}
public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        PrefixSumSolution solution = new PrefixSumSolution();
        ArrayList<Integer> result = solution.prefSum(arr);
        System.out.println("The prefix sum array is: " + result);
        sc.close();
    }
}//Time -O(n) Space-O(n)