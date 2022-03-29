 class Solution {
public:
    int XXX(vector<int>& prices) {
        int maxn=0;;
        for(int i=0;i<prices.size();i++)
        {  for(int j=prices.size()-1;j>i;j--)
            if(prices[j]-prices[i]>maxn)
                maxn=prices[j]-prices[i];
            
        }
        return maxn;
    }
};

