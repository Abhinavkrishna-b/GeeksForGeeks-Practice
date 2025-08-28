//28-08-25
import java.util.*;
class KMP_Solution {
    public int strStr(String haystack, String needle) {
        //KMP algorithm
        int lps[] = new int[needle.length()];
        int curLPS = 1, prevLPS =0;
        //LPS => longest prefix same as suffix
        while(curLPS<needle.length()){
            if(needle.charAt(prevLPS) == needle.charAt(curLPS)){
                lps[curLPS]=prevLPS+1;
                prevLPS+=1;
                curLPS+=1;
            }
            else{
                if(prevLPS == 0){
                    lps[curLPS]=0;
                    curLPS+=1;//Don't forget to increment curLPS
                }
                else{
                    prevLPS = lps[prevLPS-1];
                }
            }
        }
        int i=0,j=0; //i=>haystackIndex  j=>needle-LPS-Index
        while(i<haystack.length()){
            if(haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }
            else{
                if(j==0){
                    i++;
                }
                else{
                    j=lps[j-1];
                }
            }
            if(j==needle.length())  return i-needle.length();
        }
        return -1;
}
}
public class KMP_Algorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the haystack string: ");
        String haystack = sc.nextLine();
        System.out.print("Enter the needle string: ");
        String needle = sc.nextLine();
        KMP_Solution solution = new KMP_Solution();
        int result = solution.strStr(haystack, needle);
        if(result != -1){
            System.out.println("The needle is found in the haystack at index: " + result);
        } else {
            System.out.println("The needle is not found in the haystack.");
        }
        sc.close();
    }
}
//Time- O(n+m) Space- O(m)