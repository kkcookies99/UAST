 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        for (int i = digits.size() - 1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] <= 9) return digits;
            digits[i] = 0;
        }
        
        digits.insert(digits.begin(), 1);
        return digits;
    }
};

