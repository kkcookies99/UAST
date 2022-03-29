 class Solution {
    public String XXX(String s){
        int size = s.length();
        if(size<=1)
            return s;
        // 定义 布尔数组，判断位置 i 到位置 j 的子串是否为回文子串
        // 如果是回文子串，记录 最大子串的长度，以及初始索引值 i 
        boolean[][] dp = new boolean[size][size];
        // base case 因为 后面每个dp[i][j] 都与 dp[i+1][j-1]以及s.charAt(i)==s.charAt(j)有关
        // 所以二位矩阵的 左下角全部赋值为 true
        for(int i = 0;i<size;i++){
            for(int j = 0;j<=i;j++){
                dp[i][j] = true;
             }
         }
         int i = size-2;
         // 记录 最大长度回文子串
         int maxlen = 1;
         // 记录最大长度回文子串的初始索引
         int index = 0;
         // 从右下角往上遍历
         for(;i>=0;i--){
             for(int j = i+1;j<size;j++){
                 // 如果i到j中间的子串为回文子串（也就是 i+1到j-1位置为回文子串）
                 // 同时 i和j位置的字符相等
                 // 那么就可以判断为 回文子串 dp[i][j] = true
                 // 同时记录最长子串
                 if(dp[i+1][j-1]==true && s.charAt(i)==s.charAt(j)){
                     dp[i][j] = true;
                     if(maxlen<j+1-i){
                         index = i;
                         maxlen = j+1-i;
                     }
                 }
             }
         }
         return s.substring(index,index+maxlen);

      }
}

