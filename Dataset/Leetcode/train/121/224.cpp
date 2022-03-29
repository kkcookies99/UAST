 class Solution {
public:
    int XXX(vector<int>& prices) {
        int max_profits=0;//记录答案
        int n=prices.size();
        if(n==0)  return 0;//注意边界条件
        int max_prices=prices[n-1];//记录prices[i...n-1]中最大的股票价格
        for(int i=n-2;i>=0;i--)
        {
            int profits=max(0,-prices[i]+max_prices);
            max_profits=max(profits,max_profits);
            max_prices=max(max_prices,prices[i]);
        }
        return max_profits;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


