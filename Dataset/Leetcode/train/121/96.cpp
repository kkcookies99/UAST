 class Solution {
public:
    int XXX(vector<int>& prices) {
        int n = prices.size();
        int ans = 0;
        int mx = prices[n-1];
        for(int i=n-2;i>=0;i--){//反着来 没有利润ans=0就是最大的
            ans = max(ans,mx-prices[i]);
            mx = max(mx,prices[i]);
        }
        return ans;
    }
};

