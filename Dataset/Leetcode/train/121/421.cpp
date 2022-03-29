 class Solution {
public:
    int XXX(vector<int>& prices) {
        if(prices.empty()) return 0;
        int MIN = prices[0];
        int ans = 0;
        for(int & x: prices){
            MIN = min(MIN, x);
            ans = max(ans, x - MIN);
        }
        return ans;
    }
};

