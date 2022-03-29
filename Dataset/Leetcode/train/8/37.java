class Solution {
    
    public int XXX(String s) {
        long res = 0;
        int state = 0;//0:初始状态，1：正数状态，2：负数状态
        char[] chars = s.toCharArray();
        for (char c : chars) {

            if (state == 0 && c == ' ') {
                continue;
            } else if (state == 0 && c == '+') {
                state = 1;
            } else if (state == 0 && c == '-') {
                state = 2;
            } else if (c >= '0' && c <= '9') {
                if (state == 0) {
                    state = 1;
                }
                int tmp = c - '0';
                res = res * 10 + tmp;
                if (res > Integer.MAX_VALUE) {
                   break;
                }
            }else {
                break;
            }
        }
        if (state == 1 && res > Integer.MAX_VALUE ) {
            return Integer.MAX_VALUE;
        }
        else if (state == 2 ) {
            res = -res;
            if(res < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }
            return (int)res;
    }
}

