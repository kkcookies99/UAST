 class Solution {
    public int XXX(int[] prices) {
        /*
        动态规划，pre记录最小购买时间，maxPro记录最大收益
        注意最大收益不一定出现在最小购买时间之后
        如 [7,3,15,1,6,4]
        */
        int maxPro = 0,pre=prices[0];
        for(int i : prices){
            pre=Math.min(pre,i);
            maxPro=Math.max(maxPro,(i-pre));
        }
        return maxPro;
    }
}

