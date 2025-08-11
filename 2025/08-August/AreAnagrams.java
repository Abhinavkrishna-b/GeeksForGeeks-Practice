//09-08-25
import java.util.*;
public class AreAnagrams {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first String: ");
        String s1 = sc.nextLine();
        System.out.print("Enter the second String: ");
        String s2 = sc.nextLine();

        boolean isValidAnagram = AreAnagramsSolution.areAnagrams(s1,s2);
        if(isValidAnagram)  System.out.println("The given two Strings are anagrams");
        else    System.out.println("The given two Strings are not anagrams");

        sc.close();
    }
}

class AreAnagramsSolution{
    static boolean areAnagrams(String s1,String s2){
         if(s1.length() != s2.length())  return false;
        //Now the length of two strings must be equal so there may be a anagram
        int counter[] = new int[26];//Atmax there are only 26 lowercase alphabets
        for(int i=0;i<s1.length();i++){
            counter[s1.charAt(i)-'a']++;
            counter[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){//i<26 important
            if(counter[i]!=0)   return false;
            //here in the if condition is not like counter[i]>0 bcoz there may be some element in s2 that are not in s1 then that result in negative values
        }
        return true;
    }
}
//Time- O(n) Space- O(26)~O(1);