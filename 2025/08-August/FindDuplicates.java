//11-08-25
import java.util.*;

class FindDuplicatesSolution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]) - 1;
            if (arr[index] < 0) {
                result.add(index + 1);
            } else {
                arr[index] = -arr[index];
            }
        }
        return result;
    }
}

public class FindDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        FindDuplicatesSolution sol = new FindDuplicatesSolution();
        ArrayList<Integer> ans = sol.findDuplicates(arr);
        if(ans.size()==0)   System.out.println("No duplicates");
        else{
        System.out.println("Duplicates: ");
        Collections.sort(ans);
        for (int num : ans) {
            System.out.print(num + " ");
        }
        sc.close();
        }
    }
}//Time- O(n) Space- O(1)