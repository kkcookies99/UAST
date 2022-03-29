 class Solution {
public:
    int XXX(vector<int>& prices) {
        int buy=prices[0],sell=buy,len=0;
        for(int i=1;i<prices.size();i++){
            if(prices[i]<prices[i-1] && prices[i]<buy){
                buy=prices[i];
                sell=buy;
            }
            else{
                sell=prices[i];
                len=max(len,sell-buy);
            }
        }
        return len;
    }
};

