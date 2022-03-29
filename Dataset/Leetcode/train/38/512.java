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
        s = s + "a";
        //随便加 一个字符进去，它就成了新的最后一组，原先的最后一组就算进去了
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
        return sb.toString();
    }
}

