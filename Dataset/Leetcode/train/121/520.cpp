 class Solution {
public:
    int XXX(vector<int>& prices) {
        int buy = INT_MIN, sell = 0;
        for(const int&p: prices){
            buy = max(buy, -p);
            sell = max(sell, p + buy);
        }
        return sell;
    }
};

