 class Solution {
    public String XXX(int n) {
        String[] dp=new String[n];
        dp[0]="1";
        for(int i=1;i<n;i++){
            StringBuilder res=new StringBuilder();
            char[] pre=dp[i-1].toCharArray();
            int j=0,k=0;//指向前一个的指针
            while(k<pre.length){
                while(k<pre.length&&pre[k]==pre[j]){
                    k++;
                }
                String num=String.valueOf(k-j);
                res.append(num);
                res.append(pre[j]);
                j=k;
            }
            dp[i]=res.toString();
        }
        return dp[n-1];
    }
}

