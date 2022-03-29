 class Solution {
public:
    int XXX(vector<int>& prices) {
        int n = prices.size();
        int ans = 0;
        int minp=prices[0];
        for(int i=1;i<n;++i){
            minp=min(minp,prices[i]);
            ans=max(ans,prices[i]-minp);
        }
        return ans;
    }
};

