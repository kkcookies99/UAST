 class Solution {
    public int XXX(int[] prices) {
        int max = 0;
        int low = 0;
        for(int i = 1;i<prices.length;i++){
            //更新最高利润
            if(prices[i]-prices[low]>max)
                max = prices[i]-prices[low];
            //更新买入最低价
            if(prices[i]-prices[low]<0)
                low = i;
        }
        return max;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


