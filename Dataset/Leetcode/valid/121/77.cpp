 class Solution {
public:
    int XXX(vector<int>& prices) {

        //int * dp = new int[prices.size()];
        //dp[0] = 0;
        int tempMaxVal = 0;
        int minVal = prices[0];
        int maxVal = 0;

        for(auto i = 1; i < prices.size(); ++i){
            minVal = prices[i] < minVal ? prices[i] : minVal;
            tempMaxVal = prices[i] - minVal;
            
            maxVal = tempMaxVal > maxVal? tempMaxVal : maxVal;
        }

        return maxVal;
    }
};

