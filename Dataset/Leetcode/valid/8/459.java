 class Solution {
    public int XXX(String s) {
        if (s.length() == 0) return 0;  

        //去除前导空格
        int index = 0;
        while(s.charAt(index) == ' ') {
            index++;
            if (index >= s.length()) return 0;
        }
        s = s.substring(index);

        //判断有无正负号
        char c0 = s.charAt(0);
        if (c0 != '-' && c0 != '+' && ((int)c0 < 48 || (int)c0 > 57 )) {
            return 0;//不以正负号和数字开头的，直接返回0
        }
        boolean flag = true;
        if(c0 == '-') flag = false;
        if(c0 == '+' || c0 == '-') s = s.substring(1);

        long sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int c = (int)s.charAt(i);
            if (c >= 48 && c <= 57) {
                sum = sum * 10 + (c - 48);
                if (sum > Integer.MAX_VALUE) {
                    if (flag) {
                        sum = Integer.MAX_VALUE;
                    } else {
                        sum = Integer.MIN_VALUE;
                    }
                    break;
                }
            } else {
                break;
            }
        }

        return flag?(int)sum:-(int)sum;
    }
}

