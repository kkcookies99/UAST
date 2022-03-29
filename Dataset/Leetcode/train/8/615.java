 class Solution {
    public int XXX(String s) {
        int res = 0;
        int index = 0;
        int len = s.length();
        char[] array = s.toCharArray();
        //先去除前导空格 
        //要设置 index < len 否则遇到都是空格的字符串会越界
        while(index < len && array[index] == ' '){
            index ++;
        }
        //极端情况 s="    "
        if(index == len) return 0;
        int sign = 1;
        if(array[index] == '-'){
            sign = -1;
            index ++;
        } 
        else if(array[index] == '+'){
            index ++;
        }
        while(index < len){
            //首次出现非数字字符或者最后出现非数字字符退出
            if(array[index] > '9' || array[index] < '0') break;
            int num = sign * (array[index] - '0');
            //判断是否溢出情况
            if(res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && num > Integer.MAX_VALUE % 10)){
                return Integer.MAX_VALUE;
            }
            if(res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && num < Integer.MIN_VALUE % 10)){
                return Integer.MIN_VALUE;
            }
            res = res * 10 + num;
            index ++;
        }
        return res;
    }
}

