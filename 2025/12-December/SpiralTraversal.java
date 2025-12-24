//24-12-25
import java.util.*;

public class SpiralTraversal {
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = mat.length;
        int m = mat[0].length;

        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) {
                res.add(mat[top][j]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                res.add(mat[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    res.add(mat[bottom][j]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res.add(mat[i][left]);
                }
                left++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        SpiralTraversal solution = new SpiralTraversal();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        ArrayList<Integer> result = solution.spirallyTraverse(matrix);

        System.out.println("The spiral traversal of the matrix is:");
        for (int num : result) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
