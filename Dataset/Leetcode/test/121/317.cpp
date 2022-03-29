 class Solution {
public:
    int XXX(vector<int>& prices) 
    {
        int minVal = prices[0],maxPro = 0;
        for(int i = 1;i < prices.size();i++)
        {
            maxPro = max(prices[i] - minVal,maxPro);
            minVal = min(minVal,prices[i]);
        }
        return maxPro;
    }
};

