//24-08-2025
import java.util.*;
class PalindromeSolution{
    public static boolean isPalindrome(String s){
        int left=0,right=s.length()-1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        boolean result = PalindromeSolution.isPalindrome(s);
        if(result){
            System.out.println("The given string is a palindrome.");
        }else{
            System.out.println("The given string is not a palindrome.");
        }
        sc.close();
    }
}
//Time- O(n) Space- O(1)