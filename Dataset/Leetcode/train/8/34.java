class Solution {
    public int XXX(String s) {
         long res = 0;
        char[] arr = s.toCharArray();
        int flag = -1; //0:正数 1:负数
        for (char c : arr) {
            if (c == ' ' && flag == -1) { //遇到空格跳过
                continue;
            } else if (c == '+' && flag == -1) { //第一次遇到+号记录
                flag = 0;
                continue;
            } else if (c == '-' && flag == -1) { //第一次遇到-号记录 这里不考虑"00-33"这种情况
                flag = 1;
                continue;
            } else if (48 <= c && c <= 57 ) { //  char类型 48-57代表0-9
                if (flag == -1) {
                    flag = 0;
                }
                //有可能前面的是0
                if (c == 48 && res == 0) {
                    continue;
                }
                int num = Integer.parseInt(String.valueOf(c));
                res = res * 10 + num;

                //超界情况处理 这里还需要正负的处理
                if (flag == 0 && res > Integer.MAX_VALUE) {
                    res = Integer.MAX_VALUE;
                    break;
                }
                if (flag == 1) {
                    long temp = 0 - res;
                    if (temp < Integer.MIN_VALUE) {
                        res = Integer.MIN_VALUE;
                        break;
                    }
                }
            } else {
                break;
            }
        }

        if (flag == 1) {
            res = 0 - res;
        }

        return (int) res;
    }
}

