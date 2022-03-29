class Solution {
public:
    int XXX(int n) {
        /*
        最后一步：
            1. 走一个台阶，即从i - 1走到i
            2. 走两个台阶，即从i - 2走到i 
        确定状态：
            设状态f[i]表示爬到第i阶楼梯的方式数目
        状态方程：
            f[i] = f[i - 1] + f[i - 2]
        初始状态：
            f[0] = 1
            f[1] = 1
        边界条件：i >= 2
        计算顺序：从小到大
        */

        vector<int> f(n + 1,0);

        f[0] = 1;
        f[1] = 1;
        
        for(int i = 2 ; i <= n ; ++i){
            f[i] = f[i-1] + f[i-2];
        }

        return f[n];
    }
};

