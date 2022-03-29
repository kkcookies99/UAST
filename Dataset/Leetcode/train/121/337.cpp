 class Solution {
public:
    int XXX(vector<int>& prices) { 
        if(prices.size()<=1)return 0;
        int buy=0;
        int profit=0;
        for(int i=0;i<prices.size();i++)
        {
          if(prices[i]<=prices[buy])buy=i;
          else if(prices[i]-prices[buy]>profit)profit= prices[i]-prices[buy];
        }
        return profit;
    }
};

