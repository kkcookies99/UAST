 class Solution {
    public int XXX(int[] prices) {
        // 动态规划
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : prices){
            // 存入每次的最少值
            min = Math.min(i, min);
            // 当前的差值、与之前的差值进行判断
            max = Math.max(i - min, max);
        }
        return max;
    }
}

