 class Solution {
public:
    int XXX(vector<int>& prices) {
        if(prices.size()<2) return 0;
        
        int res = 0;
        int left=0, right=1;
        
        while(right < prices.size()){
            
            if(prices[left] > prices[right]){
                left = right;
            }else if(prices[left] < prices[right]){
                res = ( prices[right] - prices[left] ) > res ? ( prices[right] - prices[left] ) : res;
            }
            right++;
        }
        
        return res;
    }
};

