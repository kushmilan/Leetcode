class Solution {
    public int maxProfit(int[] prices) {
        int minPri = Integer.MAX_VALUE;
        int profit = Integer.MIN_VALUE;
        for(int i : prices){
            minPri = Math.min(minPri, i);
            profit = Math.max(profit, i - minPri);
        }
        return profit;
    }
}