 class Solution {
public:
    int XXX(vector<int>& prices) {
        //特殊值
        if (prices.size() < 2) {
            return 0;
        }
        int sum=prices[1] - prices[0], max_Profit = sum, tmp=0, diff;
        //求出隔天利润值，得到长度为N-1的隔天利润值数组，求解最大子序列和
        for (int i=1; i<prices.size()-1; i++) {
            diff = prices[i+1] - prices[i];
            if (sum + diff < diff) {
                sum = diff;
            } else {
                sum += diff;
            }
            if (sum > max_Profit) {
                max_Profit = sum;
            }
        }
        return max_Profit < 0 ? 0 : max_Profit;
    }
};

