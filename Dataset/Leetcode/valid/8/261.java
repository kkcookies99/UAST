class Solution {
     public int XXX(String str) {
        if(str == null || "".equals(str)){
            return 0;
        }
        int index = 0;
        int space = 0; //标记空格和正负号
        for(;index < str.length() && str.charAt(index) == ' ';index++) {space++;}//去空格
        boolean isF = false;
        if(index < str.length() && ('-' == str.charAt(index) || '+' == str.charAt(index))) { //判断负数
            isF = '-' == str.charAt(index);
            index++; space++;
        }
        long ans = 0;//最终结果
        int paserInt = 0; int preZero = 0;
        for(;index < str.length() && (paserInt = parseChar(str.charAt(index))) != -1 ; index++) {
            if(ans == 0 && paserInt == 0) preZero++;
            ans = ans * 10 + paserInt;
        }
        if(index - preZero - space -1 > 10) return isF ? Integer.MIN_VALUE :Integer.MAX_VALUE;
        if(isF) {
             return -ans < (long)Integer.MIN_VALUE ? Integer.MIN_VALUE : -(int)ans;
        }

        return ans > (long)Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)ans;
    }

    private int parseChar(char c) {
        if(c >='0' && c<='9') {
            return c - '0';
        }
        return -1;
    }
}


