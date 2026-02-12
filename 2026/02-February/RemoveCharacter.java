//12-02-26
import java.util.*;

public class RemoveCharacter {
    static String removeChars(String str1, String str2) {
        boolean remove[] = new boolean[26];
        for(int i=0;i<str2.length();i++){
            remove[str2.charAt(i) - 'a'] = true;
        }
        
        StringBuilder result = new StringBuilder();
        for(int i=0;i<str1.length();i++){
            if(remove[str1.charAt(i) - 'a'] != true){
                result.append(str1.charAt(i));
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This codes deletes all the characters from str1 which are present in str2");
        System.out.println("Enter str1: ");
        String str1 = sc.nextLine();
        System.out.println("Enter str2: ");
        String str2 = sc.nextLine();
        System.out.println(removeChars(str1, str2));
        sc.close();
    }
}
//Time- O(n+m)
//Space- O(26) - O(1) without considering the output string.
