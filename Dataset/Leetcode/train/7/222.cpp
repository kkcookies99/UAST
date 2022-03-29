class Solution {
public:
    int XXX(int x) {
        int max = 0x7fffffff, min = 0x80000000;
        long res = 0;
        // 注意的是 C++ 里面的整除和取余运算相对于 python 有所差异,所以甚至不需要考虑正负号的运算
        while (x!=0){
            res = res*10+x%10;
            x/=10;
        }
        return res>max||res<min?0:res;
        // return 0x80000000;
    }
};

