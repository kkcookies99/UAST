 class Solution {
    public String XXX(int n) {
        String s = "1";
        for (int i = 2; i <= n; i++) {
            s = nextString(s);
        }
        return s;
    }
    String nextString(String s) {
        // 往结尾添加一个“哨兵”
        s = s + "a";
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        char[] cs = s.toCharArray();
        char c = cs[0];
        int cnt = 1;
        for (int i = 1; i < n; i++) {
            char cur = cs[i];
            if (cur == c) {
                cnt++;
            } else {
                sb.append(cnt);
                sb.append(c);

                c = cur;
                cnt = 1;
            }
        }
        return sb.toString();
    }
}

