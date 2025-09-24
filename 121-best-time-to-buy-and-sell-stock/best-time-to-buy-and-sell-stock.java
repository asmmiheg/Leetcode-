class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buyPrice=Integer.MAX_VALUE, maxP=0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice>prices[i]){
                buyPrice=prices[i];
            }
            profit=prices[i]-buyPrice;
            maxP=Math.max(profit,maxP);
        }
        return maxP;
    }
}