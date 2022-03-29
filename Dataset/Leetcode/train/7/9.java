class Solution {
    public int XXX(int x) {
        if(x == Integer.MIN_VALUE) {
            return 0;
        }
        int net = x< 0 ? -1 : 1;
        x *= net;
        int neg = 0;
        while(x>0){
            int n = neg;
            //反转后的数字每次乘余10
            n *= 10;
            //获取反转的首位，余数
            n += x%10;
            //原数字除于10，去掉末尾
            x /= 10;
            if(n/10 != neg) {
                return 0;
            }
            neg = n;
        }
        return net * neg;
    }
}

