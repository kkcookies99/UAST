 class Solution {
public:
    int XXX(vector<int>& prices) {
        int res=0;
        int maxright=0;
        for(int j=prices.size()-1;j>=0;j--){
            if(j==prices.size()-1){
                maxright=prices[j];
            }
            maxright=max(prices[j],maxright);
            res=max(res,maxright-prices[j]);
        }
        return res;
    }
};

