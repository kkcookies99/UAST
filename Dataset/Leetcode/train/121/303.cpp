 class Solution {
public:
    int XXX(vector<int>& prices) {
        if(prices.empty()){
            return 0;
        }
        int max, min = prices[0];
        int mprice = max - min;
        for(int i = 0; i<prices.size(); i++){
            if(prices[i]<min){
                min = prices[i];
                max = min;
            }
            if(prices[i]> max)
                max = prices[i];
            if(max-min>mprice)
                mprice = max-min;
        }
        return mprice;
    }
};

