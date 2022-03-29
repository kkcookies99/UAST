class Solution {
    static int head;//标记正负
    static int ans;//返回结果
    public static int XXX(String s) {
        if (s == null || s.length() == 0)
            return 0;

        //初始化
        ans = 0;
        head = 1;

        int i = 0;
        //排除开头空格
        while (i < s.length() && s.charAt(i) == ' ')
            i ++;
        //全是空格
        if (i == s.length())
            return 0;

        char c = s.charAt(i);
        //若第一个非空格字符是+ -
        if (c == '+' || c == '-' ){
            //记录正负
            head = c == '+' ? 1 : -1;
            //继续向后跳一位
            i ++;
        }

        //接下来的字符必须是连续的数字
        while (i < s.length()){
            c = s.charAt(i++);
            if (c < '0' || c > '9')
                break;
            else{
                long v = (long)ans * 10 + head * (c - '0');
                if (v > Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
                if (v < Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;
                ans = (int)v;
            }
        }

        return ans;
    }
}

