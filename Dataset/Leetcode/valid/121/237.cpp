 class Solution {
public:
    int XXX(vector<int>& prices) {
        int minValue = prices[0];
        int result = 0;

        for(int i=1;i<prices.size();i++){
            result = max(result, prices[i]-minValue);
            minValue = min(minValue, prices[i]);
        }

        return result;

    }
};

