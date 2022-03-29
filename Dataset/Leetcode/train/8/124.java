class Solution {
    public int XXX(String str) {
        int sign = 0;
        long ans = 0;
        boolean num = false;
        for(char c:str.trim().toCharArray()) {
           if(c >= '0' && c <= '9') {
                num = true;
                ans = ans * 10 + c - '0';
                if(sign >= 0 && ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if(sign == -1 && sign*ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            } else {
                if(c == '+' || c == '-') {
                    if(sign != 0 || num)
                        break;
                    sign = c == '+'?1:-1;
                } else break;
            }
        }
        return (int)((sign == 0?1:sign)*ans);
    }
}

