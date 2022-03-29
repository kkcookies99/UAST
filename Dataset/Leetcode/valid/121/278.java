 class Solution {
    public int XXX(int[] prices) {
        int sum = 0, maxNum = prices[prices.length - 1];
        for (int i = prices.length - 2; i >= 0; i--) {
            maxNum = Math.max(prices[i], maxNum);
            sum = Math.max(sum, maxNum - prices[i]);
        }
        return sum;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


