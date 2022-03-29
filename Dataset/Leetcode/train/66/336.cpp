 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int carry = 1;
        vector<int> res;
        int i = digits.size() - 1;
        while (i >= 0 || carry != 0) {
            int sum = carry;
            if (i >= 0) sum += digits[i];
                
            res.push_back(sum % 10);
            carry = sum / 10;
            i--;
        }

        return vector<int>(res.rbegin(), res.rend());
    }
};

