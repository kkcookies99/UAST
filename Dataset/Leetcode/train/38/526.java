 class Solution {
    public String XXX(int n) {
        String[] ans = new String[n];
        ans[0] = "1";
        for (int i = 1; i < n; i++) {
            String lastStr = ans[i - 1];
            StringBuilder builder = new StringBuilder();
            int tempCount = 1;
            char c = lastStr.charAt(0);
            for (int j = 1; j < lastStr.length(); j++) {
                char cur = lastStr.charAt(j);
                char last = lastStr.charAt(j - 1);
                if (cur == c) {
                    tempCount++;
                }else {
                    builder.append(tempCount).append(last);
                    tempCount = 1;
                    c = cur;
                }
            }
            if (tempCount != 0) {
                builder.append(tempCount).append(lastStr.charAt(lastStr.length() - 1));
            }
            ans[i] = builder.toString();
        }
        return ans[ans.length - 1];
    }
}

