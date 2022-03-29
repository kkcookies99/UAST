 class Solution {
public:
    int XXX(vector<int>& prices) {
        int minprice = INT_MAX;
        int maxprofit = 0;
        //找到最小的值，然后依次比较最小值后面每个值与最小值的差值的大小，保留最大的差值
        for (int i = 0; i < prices.size(); i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
};

