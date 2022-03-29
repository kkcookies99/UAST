class Solution {
    public boolean XXX(int x) {
        if (x < 0) {
            return false;
        }
        
        //hold住x原来的值
        int orgX = x;
        //求正整数的反转数
        int rev = 0;
        while (x != 0) {
            int digit = x % 10; //余数
            rev = rev * 10 + digit;
            x = x / 10;
        }
        return rev == orgX ? true : false;
    }
}

