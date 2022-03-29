 class Solution {
    public int XXX(int[] prices) {
        //用一个辅助数组 记录今天买到明天卖亏损情况 
        int[] help=new int[prices.length];
        for(int i=1;i<prices.length;i++){
            help[i-1]=prices[i]-prices[i-1];
        }

        //然后使用leetcode 53题 最大子序列和就可以求出答案了
        return process(help);
    }

    public int process(int[] arr){
        int cur = 0;
        int max=arr[0];
         for(int i=0;i<arr.length;i++){
            int num=cur;
            cur+=arr[i];
            if(cur < 0){
                max=Math.max(max,arr[i]);
                cur=0;
            }else if(cur > num){
                max=Math.max(max,cur);
            }
        }
        return max<0?0:max;
    }
}

