 class Solution {
public:
    int XXX(vector<int>& prices) {
        if(prices.empty()==true) return 0;
        int size=prices.size(),i,max=0;
        int *temp=new int[size];
        //temp[i]代表前i+1周最便宜价格
        temp[0]=prices[0];
        for(i=1;i<size;i++)
        {
            temp[i]=prices[i]<temp[i-1]?prices[i]:temp[i-1];
        }
        //temp[i]表示第i周卖出时的利润
        for(i=size-1;i>=0;i--)
        {
            temp[i]=prices[i]-temp[i];
            if(temp[i]>max) max=temp[i];
        }
        delete[] temp;
        return max;
    }
};

