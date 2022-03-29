 class Solution {
public:
    int XXX(vector<int>& prices) {
        int N = prices.size();

        int pre = 0,cur = 0,rst=0;
        for(int i=1;i<N;i++){
            auto del = prices[i]-prices[i-1];
            cur = max(del,del+pre);
            pre = cur;
            rst = max(rst,cur);
        }
        return rst;
        
    }
};

