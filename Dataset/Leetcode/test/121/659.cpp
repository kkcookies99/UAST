 class Solution {
public:
    int XXX(vector<int>& prices) {
        int n = prices.size();
        int minInput = prices[0];
        int XXX = 0;

        for (int i = 1; i < n; ++i) {
            XXX = max(XXX, prices[i] - minInput);
            minInput = min(minInput, prices[i]);
        }

        return XXX;
    }
};

