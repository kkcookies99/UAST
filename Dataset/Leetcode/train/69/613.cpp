class Solution {
public:
// 等价于找一个数 mid*mid是小于等于x的最大值
    int XXX(int x) {
        if(x < 1) return x;
        int l = 0, r = x;
        while(l < r)
        {
            long mid = l + r + 1ll>>1;
            if(mid * mid <= x) l = mid;
            else r = mid -1; 
        }
        return l;
    }
};

