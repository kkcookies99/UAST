 class Solution {
    public int XXX(String s) {
        s = s.trim();
        int pos = 0;
        int sign = 1;
        long ans = 0;
        int n = s.length();
        if(n == 0) return 0;
        if(s.charAt(0) == '-'){
            sign = -1;
            pos++;
        }
        if(s.charAt(0) == '+'){
            sign = 1;
            pos++;
        }
        int max = (1 << 31) - 1;
        int min = -1 << 31;
        while(pos < n && s.charAt(pos) >= '0' && s.charAt(pos) <= '9' ){
            int tmp = s.charAt(pos) - '0';
            ans = ans * 10 + tmp;
            pos++;
            if(sign * ans > max) return max;
            if(sign * ans < min) return min;
        }
        return sign * (int)ans;

    }
}

