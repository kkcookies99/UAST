 class Solution {
    public int XXX(String s) {
        if (s.length() == 0 ) {
            return 0;
        }
        int i = 0;
        while(i < s.length() && s.charAt(i) == ' ') i++;
    
        int flag = i < s.length() && s.charAt(i) == '-' ? -1 : 1;
        if(i < s.length() && s.charAt(i) == '+')
            i++;
        if (flag == -1) {
            i++;
        }
        int j = s.length() ;
    
        long res = 0;
        while(i < j) {
            int num = s.charAt(i) - '0';
            if (num >= 0 && num <= 9) {
                if (res > 0) {
                    res*= 10;
                }
                res += num;
                //res *= 10; 
                i++;
                if (res*flag > (Integer.MAX_VALUE)) {
                    return Integer.MAX_VALUE;
                } else if (res*flag < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
            } else {
                break;
            }
        }
        //res/=10;
        res*=flag;
        if (res > (Integer.MAX_VALUE)) {
            res = Integer.MAX_VALUE;
        } else if (res < Integer.MIN_VALUE) {
            res = Integer.MIN_VALUE;
        }
        return (int)res;
    }
}

