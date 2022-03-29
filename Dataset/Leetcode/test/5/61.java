 class Solution {
    public String XXX(String s) {
        if(s.length() == 1) return s;
        int[][] memo = new int[s.length()][s.length()];
        int start = 0; 
        int end = s.length() - 1;
        int max = -1;
        for(int i = 0; i < s.length(); i++) {
            for(int j = i; j < s.length(); j++) {
                int cur = tryFind(i, j, s, memo);
                if(cur > max) {
                    start = i;
                    end = j;
                    max = cur;
                }
            }
        }
        return s.substring(start, end + 1);
    }
    // 确认String中start - end是否为回文串 返回memo[start][end] = -1表示不是回文，=0表示未探索，=n表示是回文长度
    private int tryFind(int start, int end, String s, int[][] memo) {
        if(memo[start][end] != 0) return memo[start][end];
        if(start == end) return memo[start][end] = 1;         
        if(end - start == 1) {
            if(s.charAt(start) == s.charAt(end)) {
                return memo[start][end] = 2;
            } else {
                return memo[start][end] = -1;
            }
        }
        int maxLen = -1;
        // 可能是
        if(s.charAt(start) == s.charAt(end)) {
            int subLen = tryFind(start + 1, end - 1, s, memo);
            if(subLen != -1) {
                maxLen = 2 + subLen;
            }
        }
        return memo[start][end] = maxLen;
    }
}

