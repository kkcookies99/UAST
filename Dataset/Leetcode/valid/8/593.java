 class Solution {
    public int XXX(String s) {
        if (s==null || s.length()==0) {
            return 0;
        }

        int begin=-1; // 略过前导0，数组开始位置
        int end=-1; // 数组结束位置
        int i = 0; // i 为指针
        char sign = '+'; // sign 为符号，默认'+'
        
        // 处理字符串
        while (i<s.length() && s.charAt(i)==' ') {
            i++;
        }
        if (i<s.length() && (s.charAt(i)=='-'||s.charAt(i)=='+')) {
            sign = s.charAt(i);
            i++;
        }
        if (i<s.length() && !(s.charAt(i)>='0' && s.charAt(i)<='9')) {
            return 0;
        }
        while (i<s.length() && s.charAt(i)=='0') {
            i++;
        }
        while (i<s.length() && (s.charAt(i)>='0' && s.charAt(i)<='9')) {
            if (begin==-1) begin=i;
            i ++;
            end = i; // s.subString(begin,end)计算的是左闭右开，即 [begin, end)
        }
        if (end==-1) return 0;
            
        
        // 不包含前导0的字符串长度超过10，一定溢出
        if (end-begin>=11) {
            if (sign =='-') return Integer.MIN_VALUE;
            else return Integer.MAX_VALUE;
        }

        // 用long存储，添加符号
        long ans = Long.parseLong(s.substring(begin, end));
        if (sign == '-') ans=-1*ans;

        // 判断是否溢出
        if (ans < Integer.MIN_VALUE)  return Integer.MIN_VALUE;
        else if (ans > Integer.MAX_VALUE)  return Integer.MAX_VALUE;

        return (int)ans;

    }
}

