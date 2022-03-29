 class Solution {
public:
    int XXX(vector<int>& prices) {
        int minPrice=INT_MAX;
        int ans=0;
        for(int i=1; i<prices.size(); i++){
            minPrice = min(minPrice, prices[i-1]);
            ans = max(ans, prices[i] - minPrice); 
        }
        return ans;
    }
};

