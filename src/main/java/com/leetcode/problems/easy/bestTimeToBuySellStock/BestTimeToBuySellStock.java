package com.leetcode.problems.easy.bestTimeToBuySellStock;

public class BestTimeToBuySellStock {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int left = 0;
        int right = 1;

        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(profit, maxProfit);
            } else {
                left = right;
            }

            right++;
        }

        return maxProfit;
    }
}
