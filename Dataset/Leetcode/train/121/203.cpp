 class Solution {
public:
    int XXX(vector<int>& prices) {
        if(prices.size()==0)
            return 0;
        vector<int>dpmin(prices.size());
        dpmin[0]=prices[0];
        for(int i=1;i<prices.size();i++)
        dpmin[i]=dpmin[i-1]<prices[i]?dpmin[i-1]:prices[i];
        int maxn=0;
        for(int i=1;i<prices.size();i++)
        {
            if(prices[i]-dpmin[i-1]>maxn)
                maxn=prices[i]-dpmin[i-1];
        }
        return maxn;
    }
};

