 class Solution {
    public int XXX(String s) {
        if (s == null || s.equals("")){
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        map.put(s.charAt(0), 0);
        int[] dp = new int[s.length()];
        dp[0] = 1;
        int max = dp[0];
        for (int i = 1; i < s.length(); i++){
            char c = s.charAt(i);
            if (map.containsKey(c)){
                dp[i] = Math.min(i - map.get(c), 1 + dp[i - 1]);
            }else {
                dp[i] = 1 + dp[i - 1];
            }
            map.put(c, i);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}

