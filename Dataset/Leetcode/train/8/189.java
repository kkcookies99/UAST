class Solution {
    public int XXX(String str) {
        char[] chars = str.toCharArray();
        long num = 0;
        boolean flag = false;
        int sign = 1;
        for (int i = 0; i < chars.length; i++) {
            if(sign*num > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign *num <Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            if (chars[i] <= '9' && chars[i] >= '0') {
                flag = true;
                num = num * 10 + (int) (chars[i] - '0');
            } else if (flag == false && chars[i] == ' ') {
                continue;
            } else if (flag == false && chars[i] == '-') {
                flag = true;
                sign = -sign;
            }else if (flag == false && chars[i] == '+') {
                flag = true;
            } else {
              break;
            }
        }
        num = num *sign;
        if(sign>0){
            return num>Integer.MAX_VALUE?Integer.MAX_VALUE:(int)num;
        }else {
            return num<Integer.MIN_VALUE?Integer.MIN_VALUE:(int)num;
        }
    }
}

