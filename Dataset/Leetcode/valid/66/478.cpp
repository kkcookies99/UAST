class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int carry = 0, add = 1, n = digits.size();
        for (int i = n - 1; i >= 0 && carry + add != 0; --i) {
            int tmp = digits[i] + add + carry;
            digits[i] = tmp % 10;
            carry = tmp / 10;
            add = 0;
        }
        if (1 == carry) {
            vector ans(n+1, 0);
            ans[0] = 1;
            return ans;
        }
        return digits;
    }
};

