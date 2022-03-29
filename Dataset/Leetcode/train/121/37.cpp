 class Solution {
public:
    int XXX(vector<int>& prices) {
        int mini = INT_MAX, maxi = INT_MIN;
        for(int i = 0; i < prices.size(); ++i) {
            mini = min(mini, prices[i]);
            maxi = max(maxi, prices[i]-mini);
        }
        return maxi;
    }
};

