class Solution {
public:
    int XXX(int n) {
        if(n < 3)
            return n;
        // 如果 n大于等于3 那么可以等于
        // 先走 n-1步 然后走 1 步
        // + 先走n-2步 然后走 2步
        long k1 = 1;
        long k2 = 2;
        while(--n)
        {
            k1 += k2;
            k1 ^= k2;
            k2 ^= k1;
            k1 ^= k2;
        }
        return k1;
    }
};打卡

