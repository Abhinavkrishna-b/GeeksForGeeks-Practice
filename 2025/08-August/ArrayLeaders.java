//27-08-25
import java.util.*;
class ArrayLeadersSolution{
    public ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        int maxFromRight = arr[n - 1];
        result.add(maxFromRight);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                result.add(maxFromRight);
            }
        }
        Collections.reverse(result);
        return result;
    }
}
public class ArrayLeaders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter values of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayLeadersSolution solution = new ArrayLeadersSolution();
        ArrayList<Integer> result = solution.leaders(arr);
        System.out.println("The leaders in the array are: " + result);
        sc.close();
    }
}//Time- O(n) Space- O(1)