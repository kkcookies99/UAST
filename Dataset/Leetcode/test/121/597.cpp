 class Solution {
public:
    int XXX(vector<int>& prices) {
        int n = prices.size();
        if(n<2) return 0;
        int min_num = prices[0];
        int max_num = prices[1] - prices[0];
        for(int i=1;i<n;i++){
            if(min_num>prices[i-1]) min_num = prices[i-1];
            if(max_num<prices[i] - min_num) max_num = prices[i] - min_num;
        }
        if(max_num<0) return 0;
        return max_num;
    }
};

