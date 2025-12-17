import java.util.*;
//17-12-25

public class ContainerWithMostWater {
    public int maxWater(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        int maxArea = 0;

        while (left < right) {
            int height = Math.min(arr[left], arr[right]);
            int width = right - left;
            int area = height * width;
            maxArea = Math.max(maxArea, area);

            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }


    public static void main(String[] args) {
        ContainerWithMostWater solution = new ContainerWithMostWater();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int n = scanner.nextInt();
        int[] heights = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }

        int result = solution.maxWater(heights);
        System.out.println("The maximum amount of water that can be contained is: " + result);

        scanner.close();
    }
}
//Time- O(n)
//Space- O(1)