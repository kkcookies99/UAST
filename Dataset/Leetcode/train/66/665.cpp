class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int n = digits.size();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (digits[i] == 9) {
                count++;
            }
        }
        if (count == n) {
            digits.resize(n + 1);
            digits[0] = 1;
            for (int i = 1; i < n + 1; i++) {
                digits[i] = 0;
            }
            return digits;

        }
        else {
            for (int i = n - 1; i >= 0; i--) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                }
                else {
                    digits[i] += 1;
                    break;
                }
            }
        }
        return digits;


    }
};

