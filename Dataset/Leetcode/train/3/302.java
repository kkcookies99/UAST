 class Solution {
    public int XXX(String s) {
        if(s.equals("")) return 0;
        char[] chars = s.toCharArray();
        int[] dp = new int[s.length()];
        dp[0] = 1;
        for(int i =1;i<chars.length;i++){
            dp[i]=dp[i-1]+1;
            for(int j = i-1;j>=i-dp[i-1];j--){
                if(chars[j]==chars[i]){
                    dp[i]=i-j;
                    break;
                }
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}

