 class Solution {
    public int XXX(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int res = Integer.MIN_VALUE;
        int min = prices[0];
        /* 
        本质上的意思是f(i) = max(当前价格 - 之前价格最小值，之前最大利润)
        */
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                res = prices[i] - min > res ? prices[i] - min : res;
            }
        }
        return res == Integer.MIN_VALUE ? 0 : res;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


