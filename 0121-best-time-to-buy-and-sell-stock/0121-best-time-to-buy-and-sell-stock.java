class Solution {
    public int maxProfit(int[] prices) {
        int smallest = prices[0];
int largest = prices[0];
 int daybuy = 0;
 int daysell = 0;
 int maxProfit = 0;
 for (int i = 0; i < prices.length; i++) {
 if (prices[i] < smallest) {
 smallest = prices[i];
 daybuy = i;
 largest = prices[i];
 daybuy=i;
 }
 if (prices[i] > largest) {
 largest = prices[i];
 daysell = i;
 }
 if (daysell > daybuy) {
 maxProfit = Math.max(maxProfit, largest - smallest);
 }
 }
 return maxProfit;

    }
}