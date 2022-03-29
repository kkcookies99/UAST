 class Solution {
public:
    int XXX(vector<int>& prices) {
        int max=0,cur=0;
        for(int i=1;i<prices.size();i++)
        {
            cur+=prices[i]-prices[i-1];
            cur=cur>=0?cur:0;
            if(cur>max)
                max=cur;
        }
        return max;
    }
};

