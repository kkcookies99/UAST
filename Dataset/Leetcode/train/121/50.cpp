 class Solution {
public:
    int XXX(vector<int>& prices) {
        int max = 0;
        for(int i=prices.size()-1;i>-1;i--)
            for(int j=0;j<i;j++)
                if(prices[i]-prices[j]>max)
                    max = prices[i]-prices[j];
        return max;
    }
};

