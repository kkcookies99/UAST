 class Solution {
public:
    int XXX(vector<int>& prices) {
        int size = prices.size();
        if(size < 2) return 0;
        int profit = 0;         // 当前最高利润
        int min = prices[0];    // 当前最低股价
        for(int i = 1; i < size; ++i){
            int p = prices[i];
            if(p <= min){
                min = p;
            }else if((p - min) > profit){
                profit = p - min;
            }
        }
        return profit;
    }
};

