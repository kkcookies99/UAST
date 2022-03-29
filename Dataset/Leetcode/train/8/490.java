 class Solution {
    public int XXX(String s) {
        /**
        res = res * 10 + sign*(cyrChar - '0')
        ' '无效，指针直接后移，符号位默认置1，找到'-'置为-1，往后遍历过程遇到非数字字符，中止循环，返回res
         */
        int len = s.length();
        char[] cArr = s.toCharArray();
        int res = 0;

        int cur = 0;
        while(cur < len && cArr[cur] == ' ') cur++;

        int sign = 1;
        //只判断第一位
        if(cur < len && cArr[cur] == '+') {
           sign = 1; 
           cur++;
        }else if(cur < len && cArr[cur] == '-') {
            sign = -1;
            cur++;
        }
        System.out.println(cur);
        while(cur < len){
            char curChar = cArr[cur];
            if(curChar > '9' || curChar < '0') break;
            //预判res是否将要越界
            if(res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && (curChar - '0') > (Integer.MAX_VALUE % 10))) return Integer.MAX_VALUE;
            if(res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && (curChar - '0') > -(Integer.MIN_VALUE % 10))) return Integer.MIN_VALUE;
            //每一步都把符号位乘进去,是负数的化，累加就能转换成累减
            res = res * 10 + sign*(curChar - '0');
            cur++;
        }

        return res;
    }
}

