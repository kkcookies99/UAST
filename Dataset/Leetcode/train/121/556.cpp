 class Solution {
public:
    int XXX(vector<int>& prices) {
        if(prices.size() < 2)
        return 0;
        int minPrice = min(prices[0],prices[1]);
        int curprofit = prices[1] - prices[0];
        for(int i = 2;i < prices.size();i++)
        {
            minPrice = min(minPrice,prices[i]);
            curprofit = max(prices[i]-minPrice,curprofit); 
        }
        if(curprofit < 0)
            return 0;
        return curprofit;
    }
};

