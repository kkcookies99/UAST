 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        digits.insert(digits.begin(), 0);
        int n = digits.size();
        int c = 1;
        for(int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + c;
            digits[i] = sum % 10;
            c = sum / 10;
        }
        return digits[0] == 1 ? digits : vector<int>(digits.begin() + 1, digits.end());
    }
};

