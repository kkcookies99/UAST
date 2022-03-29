 class Solution {
    public int XXX(int[] prices) {
        // 找到 后-前 的最大值
        int profit = 0;

        // 暴力的话是O(n^2)
        int i = 0;

        // i代表前坐标，j代表后坐标
        // 对于i，如果下一个位置的元素小于当前元素，可以直接后移了
        // 然后从i下一位置j开始，计算j-i的值并记录，如果j比i小，那么i移动到j
        while(i < prices.length - 1) {
            while(i < prices.length - 1 && prices[i] >= prices[i+1]) i++;

            int j = i + 1;
            while(j < prices.length && prices[j] > prices[i]) {
                profit = Math.max(profit, prices[j++] - prices[i]);
            }
            if(j < prices.length) i = j;
            else break;
        }

        return profit;
    }
}```

