 class Solution {
public:
    int XXX(vector<int>& prices) {
        int minp=prices[0],ans=0;
        for(int price:prices){
            minp=min(price,minp);
            ans=max(price-minp,ans);
        }
        return ans;
    }
};

