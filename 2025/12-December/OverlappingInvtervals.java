//22-12-25
import java.util.*;

public class OverlappingInvtervals {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        ArrayList<int[]> result = new ArrayList<>();

        if (arr == null || arr.length == 0) {
            return result;
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        int start = arr[0][0];
        int end = arr[0][1];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] <= end) {
                end = Math.max(end, arr[i][1]);
            } else {
                result.add(new int[]{start, end});
                start = arr[i][0];
                end = arr[i][1];
            }
        }

        result.add(new int[]{start, end});

        return result;
    }    

    public static void main(String[] args) {
        OverlappingInvtervals solution = new OverlappingInvtervals();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of intervals: ");
        int n = scanner.nextInt();
        int[][] intervals = new int[n][2];

        System.out.println("Enter the intervals:");
        for (int i = 0; i < n; i++) {
            intervals[i][0] = scanner.nextInt();
            intervals[i][1] = scanner.nextInt();
        }

        ArrayList<int[]> result = solution.mergeOverlap(intervals);

        System.out.println("The merged overlapping intervals are:");
        for (int[] interval : result) {
            System.out.println(interval[0] + " " + interval[1]);
        }
        scanner.close();
    }
}
