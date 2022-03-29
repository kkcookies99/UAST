 class Solution {
public:
    int XXX(vector<int>& prices) {
        int low = INT_MAX, result = 0;
        for(int i = 0; i < prices.size(); ++i){
            low = min(low, prices[i]);
            result = max(result, prices[i] - low);
        }
        return result;
    }
};

