 class Solution {
public:
    int XXX(vector<int>& prices) {
        int n = prices.size();
        if(n==0||n==1)
            return 0;
        int min=prices[0];
        int maxDiff=prices[1]-min;
        for(int i = 2;i<n;i++)
        {
            if(prices[i-1]<min)
                min=prices[i-1];
            int currentDiff=prices[i]-min;
            if(currentDiff>maxDiff)
                maxDiff=currentDiff;
        }
        if(maxDiff<=0) return 0;
        return maxDiff;
    }
};

