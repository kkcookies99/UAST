 class Solution {
    public int XXX(String s) {
        int n = s.length();
        if(n == 0)
            return 0;
        int sign = 1;   //符号位
        int i = 0;
        while(i < n && s.charAt(i) == ' ')   //去除空格
        {
            i++;
        }
        if(i == n)       //空串
            return 0;
        if(s.charAt(i) == '-')
        {
            sign = -1;
            i++;
        }else if(s.charAt(i) == '+')
        {
            i++;
        }

        int res = 0;
        while(i < n)   //当读入的数字为字符串时
        {
            if(s.charAt(i) > '9' || s.charAt(i) < '0')
                break;          
            int tmp = s.charAt(i) - '0';        //这里tmp一定为正数！！！       
            //判断是否越界
            if(res > 214748364 || (res == 214748364 && tmp > 7))
                return 2147483647;
            if(res < -214748364 || (res == -214748364 && tmp > 8))  //tmp一定为正数
                return -2147483648;
            res = res * 10 + sign * tmp;
            i++;    
        }
        if(res > 2147483647)
            return 2147483647;
        if(res < -2147483648)
            return -2147483648;
        //读到非数字字符结束
        return res;
    }
}

