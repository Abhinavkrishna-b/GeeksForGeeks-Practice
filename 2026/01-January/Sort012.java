//01-01-26
import java.util.*;

public class Sort012 {
    public static void sort012(int[] arr) {
        int low = 0, mid = 0;
        int high = arr.length - 1;
        int temp = 0;
        while (mid <= high) {
            if (arr[mid] == 0) {
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements (only 0s, 1s, and 2s):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        sort012(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
