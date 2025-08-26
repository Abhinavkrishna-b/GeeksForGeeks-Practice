//26-08-25
import java.util.*;
class FindTwoElementSolution{
    ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        int val=0;
        int duplicate = -1, missing = -1;
        for (int i = 0; i < n; i++) {
            val = Math.abs(arr[i]);
            if (arr[val - 1] < 0) {
                duplicate = val;
            } else {
                arr[val - 1] = -arr[val - 1];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                missing = i + 1;
                break;
            }
        }
        result.add(duplicate);
        result.add(missing);
        return result;
    }
}
public class FindTwoElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        FindTwoElementSolution solution = new FindTwoElementSolution();
        ArrayList<Integer> result = solution.findTwoElement(arr);
        System.out.println("The duplicate and missing elements are: " + result);
        sc.close();
    }
}//Time -O(n) Space -O(1)