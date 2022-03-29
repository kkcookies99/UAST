 class Solution {
    public int XXX(String s) {
        int[] values = new int[]{1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] roman = new String[]{"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"}; 
        char[] sc = s.toCharArray();
        int l = sc.length;
        int[] dp = new int[l+1];
        dp[0] = 0;
        for(int i = 0;i<roman.length;i+=2){
            if(sc[0] == roman[i].charAt(0)) dp[1] = values[i];
        }
        for(int i = 2;i<=l;i++){
            for(int j = 1;j<roman.length;j+=2){
                if(sc[i-2]==roman[j].charAt(0)&&sc[i-1]==roman[j].charAt(1)) dp[i] = dp[i-2] + values[j];
            }
            if(dp[i] == 0){
                for(int j = 0;j<roman.length;j+=2){
                     if(sc[i-1] == roman[j].charAt(0)) dp[i] = dp[i-1] + values[j];
            }
            }
        }
        return dp[l];
    }
}

