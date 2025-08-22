//22-08-25
import java.util.*;

public class FindUnion {
    static ArrayList<Integer> findUnion(int[] a, int[] b) {
        HashSet<Integer> st = new HashSet<>();

        for (int num : a)
            st.add(num);
        for (int num : b)
            st.add(num);
		
      	ArrayList<Integer> res = new ArrayList<> ();

        for(int it: st) 
            res.add(it);

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array1 size: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the array2 size:");
        int n2=sc.nextInt();
        System.out.println("Enter the array1 values:");
        int a[] = new int[n1];

        for(int i=0;i<n1;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the array2 values:");
        int b[]=new int[n2];
        for(int i=0;i<n2;i++)   b[i]=sc.nextInt();
        ArrayList<Integer> res = findUnion(a, b);

        for (int num : res)
            System.out.print(num + " ");
        sc.close();
    }
}
//Time- O(n+m) Space- O(n+m)