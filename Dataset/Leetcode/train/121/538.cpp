 class Solution {
public:
    int XXX(vector<int>& prices) {
        int n=prices.size();
        if(n==1) return 0;  
        int ans=0;
        int in=100001;
        for(int i=0;i<n;i++){
            if(prices[i]>in)
                ans=max(ans,prices[i]-in);
            else
                in=prices[i];//记录最小买入价格
        }
        return ans;
    }
};

