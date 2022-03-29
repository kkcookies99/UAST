 class Solution {
    public int XXX(String s) {
        int start = 0, n = s.length(), sign = 1;
        char []a = s.toCharArray();
        // 过滤空格直到找到数字或者符号为止
        while(start < n && !(Character.isDigit(a[start]) || a[start] == '+' || a[start] == '-')) {
            if(!check(a[start]))
                return 0;
            else start++;
        }
        if(start >= n) return 0;
        // 判断符号 默认为正
        if(start < n && a[start] == '+') ++start;
        else if (a[start] == '-') {
            sign = -1;
            ++start;
        }
        // 除去前导0 
        while(start < n && a[start] == '0') ++ start;
        if(start >= n) return 0;
        // 开始转换
        long x = 0, tmp;
        while(start < n && Character.isDigit(a[start])){
            x = x * 10 + (a[start++] - '0');
            // 判断溢出
            tmp = x * sign;
            if(tmp >= Integer.MAX_VALUE || tmp <= Integer.MIN_VALUE)
                return tmp > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return (int)x * sign;
    }   

    public boolean check(char ch){
        return (ch == '+' || ch == '-' || ch ==' ' || Character.isDigit(ch));
    }
}

