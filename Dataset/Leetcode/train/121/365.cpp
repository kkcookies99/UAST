 class Solution {
public:
    int XXX(vector<int>& prices) 
    {
        int ans=0;
        int MaxProfit=0;
        for(int i=1;i<prices.size();i++)
        {
            MaxProfit=max(MaxProfit+prices[i]-prices[i-1],prices[i]-prices[i-1]);
            if(MaxProfit>ans)
            {
                ans=MaxProfit;
            }
        }
        return ans;
    }
};

