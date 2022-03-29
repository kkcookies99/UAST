 class Solution {
public:
    int XXX(vector<int>& prices) {
        int minPrices = INT_MAX;
        int ans = 0;

        for(const int& price: prices)
        {
            if(price < minPrices)
            {
                minPrices = price;
            }
            else
            {
                ans = max(ans, price - minPrices);
            }
        }

        return ans;

    }
};

