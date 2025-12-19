//19-12-25
import java.util.*;

public class InsertIntervals {

    public ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
        // code here
        ArrayList<int[]> result = new ArrayList<>();
        int i = 0;
        int n = intervals.length;

        int newStart = newInterval[0];
        int newEnd = newInterval[1];

        while (i < n && intervals[i][1] < newStart) {
            result.add(intervals[i]);
            i++;
        }

        while (i < n && intervals[i][0] <= newEnd) {
            newStart = Math.min(newStart, intervals[i][0]);
            newEnd = Math.max(newEnd, intervals[i][1]);
            i++;
        }

        result.add(new int[]{newStart, newEnd});

        while (i < n) {
            result.add(intervals[i]);
            i++;
        }

        return result;
        
    }

    public static void main(String[] args) {
        InsertIntervals solution = new InsertIntervals();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of intervals: ");
        int n = scanner.nextInt();
        int[][] intervals = new int[n][2];

        System.out.println("Enter the intervals:");
        for (int i = 0; i < n; i++) {
            intervals[i][0] = scanner.nextInt();
            intervals[i][1] = scanner.nextInt();
        }

        System.out.println("Enter the new interval:");
        int[] newInterval = new int[2];
        newInterval[0] = scanner.nextInt();
        newInterval[1] = scanner.nextInt();

        ArrayList<int[]> result = solution.insertInterval(intervals, newInterval);

        System.out.println("The intervals after insertion are:");
        for (int[] interval : result) {
            System.out.println(interval[0] + " " + interval[1]);
        }

        scanner.close();
    }
}
