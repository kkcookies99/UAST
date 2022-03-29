 class Solution {
public:
    int XXX(vector<int>& prices) {
        int maxres=0;
        int size=prices.size();
        if(size==0) return 0;
        int temp=prices[0];
        for(int i=1;i<size;i++)
        {
            int diff=prices[i]-temp;
            if(diff>=0)
            {
                maxres=max(maxres,diff);
            }else
            {
               temp=prices[i];
            }
        }
        return maxres;
    }
};

