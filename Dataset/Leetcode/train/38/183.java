class Solution {
    public String XXX(int n) {
        String ans = "1";
        for (int i = 1; i < n; i++) {
            ans = descript(ans);
        }
        return ans;
    }
    //输入数字字符串，输出描述字符串
    String descript(String s) {
        int n = s.length();
        char[] ss = s.toCharArray();
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < n; ) {
            int cnt = 1;//记录数字个数
            char c = ss[i++];//记录字符
            while (i < n && ss[i] == ss[i - 1]) {
                ++cnt;
                ++i;
            }
            ret.append(cnt).append(c);//拼接个数和相应字符
        }
        return ret.toString();
    }
}

