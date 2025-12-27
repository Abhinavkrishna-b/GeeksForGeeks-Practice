//27-12-25
import java.util.*;

public class TransposeOfMatrix {
    public static ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        int n = mat.length;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(mat[j][i]);
            }
            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {
        int n,m;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        n = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        ArrayList<ArrayList<Integer>> transposedMatrix = transpose(matrix);
        System.out.println("The transposed matrix is:");
        for (ArrayList<Integer> row : transposedMatrix) {
            for (Integer val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}