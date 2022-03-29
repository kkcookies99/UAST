 class Solution {
public:
    int XXX(vector<int>& prices) {
        int buy=prices[0],profit=0;
        for(int i=1;i<prices.size();i++){
            buy=min(prices[i],buy);
            profit=max(prices[i]-buy,profit);
        }
        return profit;
    }
};

