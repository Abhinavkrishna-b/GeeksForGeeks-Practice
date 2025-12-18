//18-12-25
import java.util.*;

public class RainWaterTrapping {
    public int maxWater(int arr[]) {
        if (arr == null || arr.length < 3) {
            return 0;
        }

        int left = 0, right = arr.length - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (left < right) {
            if (arr[left] <= arr[right]) {
                if (arr[left] >= leftMax) {
                    leftMax = arr[left];
                } else {
                    water += leftMax - arr[left];
                }
                left++;
            } else {
                if (arr[right] >= rightMax) {
                    rightMax = arr[right];
                } else {
                    water += rightMax - arr[right];
                }
                right--;
            }
        }

        return water;
    }

    public static void main(String[] args) {
        RainWaterTrapping solution = new RainWaterTrapping();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int n = scanner.nextInt();
        int[] heights = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }

        int result = solution.maxWater(heights);
        System.out.println("The maximum amount of water that can be trapped is: " + result);

        scanner.close();
    }
}
