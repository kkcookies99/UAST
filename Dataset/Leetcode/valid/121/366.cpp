 class Solution {
public:
    int XXX(vector<int>& prices) {
        int mxEarn = 0, lowEst = prices[0];
        for(int i = 1;i < prices.size(); i++)
        {
            if(prices[i] - lowEst > mxEarn)
                mxEarn = prices[i] - lowEst;
            if(lowEst > prices[i])
                lowEst = prices[i];
        }
        return mxEarn;
    }
};

