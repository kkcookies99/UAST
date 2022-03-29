 class Solution {
public:
    int XXX(vector<int>& prices) {
        //贪心算法 取最左最小值，取最右最大值
        int result = 0;
        int low = INT_MAX;

        for (int i = 0;i<prices.size();i++){
            low = min(low,prices[i]);
            result = max(result,prices[i]-low);
        }
        return result;
    }
};

