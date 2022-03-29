class Solution {
public:
    bool XXX(int x) {
        //一位一位地反转给定数，当反转数大于或等于给定数字时停止
        //停止时有三种可能：
        //1.最后一位数字为0，前面的数字构成反转数
        //2.给定数有奇数位数（反转数与给定数字有一个数量级的差距，需要消除这个数量级）
        //3.给定数有偶数位数
        if((x < 0) || (x % 10 == 0 && x != 0))
            return false;

        int reverse = 0;
        while(reverse < x)
        {
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }
        return reverse == x || reverse / 10 == x;
    }
};

