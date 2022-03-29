class Solution {
public:
// 爬x层台阶的方法数等于爬x-1层数与爬x-2数之和，说白了就是斐波那契数列
    int XXX(int n) {
        if(n == 1)
            return 1;
        int a = 1,b = 1,c = 0,d = 2;
        while(d <= n)
        {
            c = a + b;
            a = b;
            b = c;
            d ++;
        }
        return c;
    }
};

