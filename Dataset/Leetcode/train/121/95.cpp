 class Solution {
public:
    int XXX(vector<int>& prices) {
        int n = prices.size();
        int min = prices[0];
        int ans = 0;
        for(int i = 1; i < n; i++){
                if(prices[i] < min){
                    min = prices[i];
                }
                ans = max(ans,prices[i]-min);
       }
       return ans;
    }
};

