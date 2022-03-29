 class Solution {
public:
    int XXX(vector<int>& prices) {
        int earn = 0, preLowest = prices[0];
        for(const auto &x : prices) {
            earn = max(earn, x - preLowest);
            if(x < preLowest)
                preLowest = x;
        }
        return earn;
    }
};

