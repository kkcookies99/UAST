 class Solution {
public:
    int XXX(vector<int>& prices) {
        int max1 = 0;
        int answer = 0;
        for(int i=prices.size()-1;i>=1;i--){
            max1 = max1>prices[i]?max1:prices[i];
            answer = (max1 - prices[i-1])>answer?(max1 - prices[i-1]):answer;
        }
        return answer;
    }
};

