 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int n = digits.size();
        int d = 1;
        for(int i = n-1; i >=0 && d; --i) {
            int x = digits[i] + d;
            digits[i] = x%10;
            d = x/10;
        }
        if(d) {
            vector<int> ans(n+1);
            ans[0] = d;
            for(int i = 0; i < n; ++i)
                ans[i+1] = digits[i];
            return ans;
        }else {
            return digits;
        }
    }
};

