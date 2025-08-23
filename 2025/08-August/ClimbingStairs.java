//23-08-25
import java.util.*;
//It is just fibnacci series
class ClimbingStairsSolution {
    public int countWays(int n) {
        if(n==0 || n==1)    return 1;
        int prev=1,cur=1,next=0;
        for(int i=2;i<=n;i++){
            next=prev+cur;
            prev=cur;
            cur=next;
        }
        return next;
    }
}
public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println("Enter the number of stairs: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ClimbingStairsSolution obj = new ClimbingStairsSolution();
        int noOfWays = obj.countWays(n);
        System.out.println("The possible number of distinct ways are: "+noOfWays);
        sc.close();
    }
}
//Time- O(n) Space- O(1)