class Solution {
    /*
        Input: prices = [7,1,5,3,6,4]
        Output: 5 => buy on day 2 and sell on day 5 (6-1=5)
        input: {7,6,4,3,1}; profit = 0
     */
    public int maxProfitOptimized(int[] prices) { //O(n)
       int maxProfit = 0;
        // need 2 pointers - one to track the buy and another to track the sale
       int minPrice = prices[0];
        for(int j = 0; j < prices.length; j++){
            if(minPrice > prices[j]){ // track min price
                minPrice = prices[j]; //update the min price
            }else if(prices[j] - minPrice > maxProfit){
                maxProfit = prices[j] - minPrice;  //calculate the difference
            }
        }
        return maxProfit;
    }
    
    public int maxProfit(int[] prices) { //O(n^2)
        int maxProfit = 0;
        // need 2 pointers - one to track the buy and another to track the sale
       //i tracks the buy, j tracks the sale
        for(int i = 0; i < prices.length; i++){
            for(int j = i + 1; j < prices.length; j++){
                if(prices[i] < prices[j]){
                    int difference = prices[j] - prices[i];
                    if(difference > maxProfit){
                        maxProfit = difference;
                    }
                }
            }
        }
        return maxProfit;
    }
}


public class BestTimeToBuyAndSellStock{
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] prices1 = {7,1,5,3,6,4}; //output = 6 - 1 = 5
        int profit1 = sol.maxProfit(prices1);
        System.out.println("Profit1: " + profit1);

        int[] prices2 = {7,6,4,3,1}; // profit = 0
        int profit2 = sol.maxProfit(prices2);
        System.out.println("Profit2: " + profit2);

        int profit3 = sol.maxProfitOptimized(prices1); //output:5
        System.out.println("Profit3: " + profit3);
        System.out.println("Profit4: " + sol.maxProfitOptimized(prices2));
    }
}