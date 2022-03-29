 class Solution {
public:
    int XXX(vector<int>& prices) {
        int currMinPrice = prices[0];
        int currMaxPrice = prices[0];
        int maxBenefit = 0;
        for (int i = 1; i != prices.size(); ++i){
            if (prices[i] < currMinPrice){
                currMinPrice = prices[i];
                currMaxPrice = prices[i];
            }
            if (prices[i] > currMaxPrice){
                currMaxPrice = prices[i];
                maxBenefit = max(maxBenefit, currMaxPrice-currMinPrice);
            }
        }
        return maxBenefit;
    }
};

