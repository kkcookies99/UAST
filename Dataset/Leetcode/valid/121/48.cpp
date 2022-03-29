 class Solution {
public:
    int XXX(vector<int>& prices) {
        //这就是个最大子序和的问题
        int profit = 0;
        int t = prices[0];
        for(int i = 1; i < prices.size(); ++i){
            if(prices[i] - t > profit){
                profit = prices[i] - t;
            }
            else if(prices[i] - t < 0){ //根本没有盈利可能
                t = prices[i];
            }
        }
        return profit;
    }
};

