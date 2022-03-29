class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int last = digits.size() - 1;
        digits[last]++;
        while (digits[last] > 9) {
            digits[last] = 0;
            last--;
            if (last < 0) {
                digits[0] = 0;
                digits.insert(digits.begin(), 1);
                break;
            }
            else {
                digits[last]++;
            } 
        }
        return digits;
    }
};

