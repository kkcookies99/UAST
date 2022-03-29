class Solution {
public:
    int XXX(int x) {
        // “牛顿迭代法”
        // 迭代初值
        double cur = 1;
        // 最终迭代值
        double pre;
        while(true)
        {
            // x(i)
            pre = cur;
            // x(i+1), 它是利用x(i)处切线和x轴的交点的横坐标, 也是牛顿迭代法的更新公式x(i+1) = x(i) - f(xi)/f'(xi)
            cur = (x / cur + cur) / 2;
            // 当相邻两次迭代变量差距过小时, 可以退出了, 没必要在迭代下去了
            if(std::abs(cur - pre) < 1e-7)
            {
                break;
            }
        }
        // 返回整数部分
        return (int)pre;
    }
};

