 class Solution {
    public int XXX(int[] prices) {

        int n = prices.length - 1;
        if (n == 0) return 0;
        // 最低的价格
        int min = prices[0];
        // 最高的收益
        int max = 0;
        for (int i = 1; i <= n; i++) {
            // 比较价格，更新最小价格
            min = Math.min(min, prices[i]);
            // 用当天价格减去最低价格，获得当天卖出的收益，和历史最大收益进行比较
            // 保留两者中大的一个
            max = Math.max(max, prices[i] - min);
        }
        // 返回历史最大收益
        return max;
    }
}```

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


