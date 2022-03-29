 class Solution {
public:
    int XXX(vector<int>& prices) {
        int res = 0;
        int minV = INT_MAX;
        for (auto p:prices) {
            if (p < minV) {
                minV = p;
            }
            res = max(res, p - minV);
        }

        return res;
    }
};

