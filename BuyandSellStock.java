// 121. Best Time to Buy and Sell Stock
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description

class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int max = 0;

        if (prices.length == 1) {
            return 0; // Best case, kalau cuman 1 isi array langsung return
        }

        for (int i = 1; i < prices.length; i++) {
            if (prices[left] < prices[i]) { // Kalau di pointer kurang dari prices di i
                max = prices[i] - prices[left] > max ? prices[i] - prices[left] : max; // Di cek apakah max yang sudah
                                                                                       // ada kurang atau lebih
            } else {
                left = i; // Kalau ternyata price di pointer lebih, pointer pindah ke i
            }
        }

        return max;
    }
}
