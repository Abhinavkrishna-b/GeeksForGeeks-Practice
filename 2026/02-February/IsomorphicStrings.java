//09-02-26
import java.util.*;

public class IsomorphicStrings {
    public boolean areIsomorphic(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] map1 = new int[26];
        int[] map2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            int c1 = s1.charAt(i) - 'a';
            int c2 = s2.charAt(i) - 'a';

            if (map1[c1] == 0 && map2[c2] == 0) {
                map1[c1] = c2 + 1;
                map2[c2] = c1 + 1;
            } else {
                if (map1[c1] != c2 + 1 || map2[c2] != c1 + 1) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = scanner.nextLine();
        IsomorphicStrings solution = new IsomorphicStrings();
        boolean result = solution.areIsomorphic(s1, s2);
        if (result) {
            System.out.println("The strings are isomorphic");
        } else {
            System.out.println("The strings are not isomorphic");
        }
        scanner.close();
    }
}
//Time- O(n)
//Space- O(26) ~ O(1)