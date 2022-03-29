 class Solution {
public:
    int XXX(vector<int>& prices) {
        if(prices.empty()) return 0;
        int min=prices[0],max=0;
        for(int i=1;i<prices.size();i++){
            if(prices[i]<min){
                min=prices[i];
            }else if(prices[i]-min>max){
                max=prices[i]-min;
            }
            /*可以替换成这两句
            min=std::min(min,prices[i]);
            max=std::max(max,prices[i]-min);*/
        }return max;
    }
};


