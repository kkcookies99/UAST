 class Solution {
public:
    int XXX(vector<int>& prices) {
        int prices_size=prices.size();
        int max_profit=0,min_price=INT_MAX;
        for(int j=0;j<prices_size;j++){
            min_price=min_price>prices[j]?prices[j]:min_price;
            max_profit=max_profit>(prices[j]-min_price)?max_profit:(prices[j]-min_price);
        }
        return max_profit;
    }
};

