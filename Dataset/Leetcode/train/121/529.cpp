 class Solution {
public:
    int XXX(vector<int>& prices) {
        int size = prices.size();
        int p = 0, m = prices[0];
        for(int i = 1; i < size; i++)
        {
            //p = prices[i] - m > p ? prices[i] - m : p;
            //m = m > prices[i] ? prices[i] : m;
            p = max(prices[i] - m, p);
            m = min(m, prices[i]);
        }

        return p;
    }
};

