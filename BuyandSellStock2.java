// 122. Best Time to Buy and Sell Stock II
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        if (prices.length == 0) {
            return 0; // Kalau array kosong, kita balikin langsung
        }

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) { // Ngecek langsung apakah prices di hari itu kurang dari prices hari
                                             // selanjutnya
                maxProfit += prices[i + 1] - prices[i]; // Kalau iya, langsung di tambahin ke maxProfit/di juall
                                                        // ibaratnya
            }
        }

        return maxProfit;
    }
}
