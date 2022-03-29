 class Solution {
    public String XXX(int n) {
        String s = "1";
        for (int i = 1; i < n; ++i) {
            s = fun(s);
        }
        return s;
    }

    private String fun(String s) {
        StringBuilder sb = new StringBuilder("");
        int cnt = 0;
        char mark = s.charAt(0);
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != mark) {
                sb.append(cnt).append(mark);
                mark = s.charAt(i);
                cnt = 1;
            } else {
                cnt++;
            }
        }
        sb.append(cnt).append(mark);//还得再加一次，不然最后一组算不进去
        return sb.toString();
    }
}

