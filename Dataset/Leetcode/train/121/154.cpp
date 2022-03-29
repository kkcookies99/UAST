 class Solution {
public:
    int XXX(vector<int>& prices) {
        // 1.动态规划
        // int buy=prices[0],sell=0,maxs=0;
        // for(int i=0;i<prices.size()-1;i++){
        //     buy = min(prices[i],buy);
        //     sell = prices[i+1];
        //     maxs = max(maxs,sell-buy);
        // }   
        //      return maxs;

        // 2.官方解法,感觉就像是动态规划的优化
        int minprice = 99999999999,maxp = 0;
        for(int x:prices){
            maxp = max(x-minprice,maxp);
            minprice = min(minprice,x);
        }
        return maxp;
    }
};

