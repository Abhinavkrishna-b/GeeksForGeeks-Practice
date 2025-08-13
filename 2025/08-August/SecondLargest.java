//13-08-25
import java.util.*;
class SecondLargestSolution{
    public static int getSecondLargest(int arr[]){
        if (arr.length < 2) {
            return -1; 
        }

        int largest = -1;
        int second = -1;

        for (int num : arr) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num < largest && num > second) {
                second = num;
            }
        }

        return (second != -1) ? second : -1;
    }
}
public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int secondLargest = SecondLargestSolution.getSecondLargest(arr);
        if (secondLargest != -1) {
            System.out.println("The second largest element is: " + secondLargest);
        } else {
            System.out.println("There is no second largest element.");
        }
        sc.close();
    }
}
//Time- O(n) Space- O(1)