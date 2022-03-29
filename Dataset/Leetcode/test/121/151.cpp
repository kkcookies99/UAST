 class Solution {
public:
    int XXX(vector<int>& prices) {
        int n=prices.size();
        if(n==1)return 0;
        int profit=0;//保存差值
        int maxa=prices[n-1];//保存最大值

        for(int i=n-2;i>=0;i--)
        {
            if(maxa-prices[i]>profit)
            {
                profit=maxa-prices[i];
            }else if(prices[i]>maxa)
            {
                maxa=prices[i];
            }
        }
        return profit;
    }
};

