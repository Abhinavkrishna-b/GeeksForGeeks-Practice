//31-12-25
import java.util.*;

public class PeakElement {
    public static int peakElement(int[] arr) {
        // code here
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int peakIndex = peakElement(arr);
        System.out.println("The index of a peak element is: " + peakIndex);
        scanner.close();
    }
}
//Time- O(log n)
//Space- O(1)
