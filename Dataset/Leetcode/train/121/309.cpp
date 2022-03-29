 class Solution {
public:
    int XXX(vector<int>& prices) {
        int ans = 0, p = 0;

        for(int i = 1; i < prices.size(); i++)
        {
            if(prices[i] < prices[p]) p = i;
            else
            {
                ans = max(ans, prices[i] - prices[p]);
            }
        }
        return ans;
    }
};

