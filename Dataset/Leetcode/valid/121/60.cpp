 class Solution {
public:
    int XXX(vector<int>& prices) {
        if(prices.size() == 1)
            return 0;

        int head = prices.front();
        int delta = INT32_MIN;
        for(int i : prices){
            if(i < head){
                head = i;
                continue;
            }
            int cur = i - head;
            delta = cur > delta ? cur : delta;
        }
        
        if(delta < 0)
            return 0;
        return delta;
    }
};

