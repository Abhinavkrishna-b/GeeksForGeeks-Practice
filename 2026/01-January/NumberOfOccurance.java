//07-01-26
import java.util.*;

public class NumberOfOccurance {
    static int countFreq(int[] arr, int target) {
        // code here
        int n = arr.length;
        int first = -1, last = -1;

        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                first = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (first == -1) return 0;

        low = 0;
        high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                last = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return last - first + 1;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array (sorted):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the target element to count its occurrences: ");
        int target = scanner.nextInt();

        int frequency = countFreq(arr, target);
        System.out.println("The element " + target + " occurs " + frequency + " times in the array.");
        scanner.close();
    }
}
//Time - O(log n)
//Space - O(1)
