//02-01-26
import java.util.*;

public class ArraySubset {
    public static boolean isSubset(int a[], int b[]) {
         HashMap<Integer, Integer> freq = new HashMap<>();

        for (int x : a) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        for (int x : b) {
            if (!freq.containsKey(x) || freq.get(x) == 0) {
                return false;
            }
            freq.put(x, freq.get(x) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in array A: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of array A:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of elements in array B: ");
        int m = scanner.nextInt();
        int[] b = new int[m];
        System.out.println("Enter the elements of array B:");
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }

        if (isSubset(a, b)) {
            System.out.println("Array B is a subset of Array A.");
        } else {
            System.out.println("Array B is not a subset of Array A.");
        }
        scanner.close();
    }
}
//Time- O(n+m)
//Space- O(n)