 class Solution {
public:
    int XXX(vector<int>& prices) {
        vector<int> profit(prices.size());//profit[i],表示第i天卖出的最大利润
        profit[0]=0;int res=profit[0];
        for(int i=1;i<prices.size();i++)
        {
            profit[i]=profit[i-1]+prices[i]-prices[i-1];
            if(profit[i]<0)
                profit[i]=0;
            if(profit[i]>res)
                res=profit[i];
        } 
        return res;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


