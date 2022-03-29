 class Solution {
public:
    //求组合数C(m,n)
    int combination(int m,int n){
        long numerator=1,denominator=1;
        //利用组合性质减少运算量:C(m,n)=C(m,m-n);
        if(2*n > m)
            n = m-n;
        //循环计算分子分母
        while(n != 0){
            numerator *= m--;
            denominator *= n--;
        }
        //相除即结果
        return numerator/denominator;
    }
    int XXX(int m, int n) {
        //向右走m-1步,向下走n-1步,总共走m+n-2步
        //答案即在m+n-2步中选取n-1步向下走,即C(m+n-2,n-1)
        return combination(m+n-2,n-1);
    }
};

