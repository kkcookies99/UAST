 class Solution {
public:
    int XXX(vector<int>& prices) {
        int min=INT_MAX,maxPro=0;//记录最低买入值与之后最高收益
        for(int i=0;i<prices.size();i++){
            if(prices[i]<min)
                min=prices[i];
            if(prices[i]-min>maxPro)
                maxPro=prices[i]-min;
        }
        return maxPro;
    }
};

