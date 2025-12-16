//16-12-25
import java.util.*;
public class BuyStocks {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int n = sc.nextInt();
        int prices[] = new int[n];
        System.out.println("Enter the stock prices for "+n+" days: ");
        for(int i=0;i<n;i++){
            prices[i] = sc.nextInt();
        }

        BuyStocksSolution obj = new BuyStocksSolution();
        int maxProfit = obj.maximumProfit(prices);
        System.out.println("The maximum profit that can be achieved is: "+maxProfit);

        sc.close();
    }
}


class BuyStocksSolution {
    public int maximumProfit(int prices[]) {
        // Code here
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;
        
    }
}
//Time- O(n) Space- O(1);