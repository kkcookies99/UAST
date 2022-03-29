 class Solution {
    public String XXX(int n) {

        if (n == 0) return null;
        if (n==1) return "1";
        String[] dp = new String[n];
        dp[0] = "1";
        String prev = XXX(n-1); // 获取 n-1 的字符串
        StringBuilder sb = new StringBuilder();
        char preChar = prev.charAt(0);
        int count = 1;

        for (int i = 1; i < prev.length(); i++) {
            if (preChar != prev.charAt(i)) {
                sb.append(count).append(preChar);
                preChar = prev.charAt(i);
                count = 1;
            } else {
                count++;
            }
        }
        sb.append(count).append(preChar); //循环到最后 无法添加 只能在后面手动添加一次

        return sb.toString();
    }
}

