class Solution {
public:
    bool XXX(int x) {
        if(x < 0 || (x != 0 && x % 10 == 0)) return 0; // 判断x为负数或者10的整数倍的请况
        int rev = 0;
        while(rev < x){
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return rev == x || x == rev / 10; // 判断x分别为奇数和偶数的请况
    }
};

