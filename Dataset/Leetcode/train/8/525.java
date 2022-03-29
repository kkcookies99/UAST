 class Solution {
    public int XXX(String s) {
        int res = 0;
        int isNegtive = 0;
        char[] chars = s.toCharArray();
        int index;
        //去除前导空格
        for (index = 0; index < chars.length; index++) {
            if (chars[index] == ' ')    continue; 
            else    break;           
        }
        //如果是空字符串,直接返回
        if (index == chars.length)  return res;
        //判断除前导空格之外的第一个字符
        //如果是数字，留给下端程序，如果不是数字，判断是否为符号
        if (!(chars[index] >= '0' && chars[index] <= '9')) {
            if (chars[index] == '-') {
                isNegtive = 1;
                index++;
            }
            else if (chars[index] == '+')
                index++;
            else 
                return res;
        }
        //只接受数字，累加到res,非数字则退出
        for (int i = index; i < chars.length; i++) {
            char ch = chars[i];
            if (!(ch >= '0' && ch <= '9')) break;
            //由正负符号判断加上当前字符后有没有超出int表示范围
            if (isNegtive == 1) {
                long nextNum = - ((long)res*10 + ch - '0');
                if (nextNum < Integer.MIN_VALUE)
                    return  Integer.MIN_VALUE;
            } else {
                long nextNum = (long)res*10 + ch - '0';
                if (nextNum > Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
            }
            res = res*10 + ch - '0';
        }
        return isNegtive == 1 ? -res : res;
    }
}

