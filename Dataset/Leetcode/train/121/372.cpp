 class Solution {
public:
    int XXX(vector<int>& prices) {
        int res = 0;
        int buy = INT_MAX;

        for (int price : prices) {
            if (price < buy) buy = price;
            else res = max(res, price - buy);
        }

        return res;
    }
};

