 class Solution {
public:
    int XXX(vector<int>& prices) {
        int res = 0;
        int buy = prices[0]; 
        for(const auto &price : prices){
            if(price < buy){
                buy = price;
            }
            else if(res < price-buy){
                res = price - buy;
            }
        }
        return res;
    }
};

