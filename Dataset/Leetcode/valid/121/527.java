 class Solution {
    public int XXX(int[] prices) {
        if(prices.length==1){
            return 0;
        }
        int profit =0;
        int buy =prices[0];
        for(int i=1;i<prices.length;i++){
            if(buy>prices[i]){
                buy = prices[i];
            }else if(prices[i]>buy){
                profit = Math.max(profit,prices[i]-buy);
            }
        }
        return profit;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


