 class Solution {
public:
    int XXX(vector<int>& prices) {
        if(prices.size()<=1)
            return 0;
        int curMIn = prices[0];//截止当前位置的最小值
        int profit = 0;//当前最大利润
        for(int i=1;i<prices.size();i++){
            if(prices[i]>curMIn)
                profit = max(profit,prices[i]-curMIn);
            else
                curMIn = prices[i];
        }        
        return profit;
    }
};

