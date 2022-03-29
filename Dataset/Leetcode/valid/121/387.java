 class Solution {
    public int XXX(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        if(n<=1){
            return 0;
        }
        int dp[] = new int[n];
        for(int i=1;i<n;i++){
            if(prices[i]<min){
                min = prices[i];
            }
            dp[i] = Math.max(dp[i-1],prices[i]-min);
        }
        return dp[n-1];
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


