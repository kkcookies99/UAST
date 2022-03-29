 class Solution {
public:
    int XXX(vector<int>& prices) {
        //遍历
        //当碰到第一个比price[0]小的数：记录下之前的最大利润
        //以price[0]为买入继续遍历
        int max = 0;
        int index = 0;

        for (int i=1; i<prices.size(); i++) {
           
            if (prices[i] > prices[index] + max) {
                max = prices[i] - prices[index];
            }
            else if (prices[i] < prices[index]) {
                index = i;
            }

        }


        return max;
    }
};

