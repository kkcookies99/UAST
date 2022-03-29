class Solution {
    public int XXX(int n) {
        if(n<=1){return n;}
        int[] dp = new int[n+1];
        dp[1]=1;dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


