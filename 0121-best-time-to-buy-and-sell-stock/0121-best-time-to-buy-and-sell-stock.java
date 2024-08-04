import java.math.*;
class Solution {
    public int maxProfit(int[] prices) {
        int i;
        int mini=prices[0];
        int maxprofit=0;
        int n=prices.length;
        for(i=0;i<n;i++)
        {
            
            {
                int cost=prices[i]-mini;
                maxprofit =Math.max(maxprofit,cost);
                mini=Math.min(mini,prices[i]);
            }
        }return maxprofit;
    }
}