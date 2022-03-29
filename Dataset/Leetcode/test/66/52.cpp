 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        for(int i = digits.size() - 1; i >= 0; --i) {
            if(digits[i] + 1 == 10) {
                digits[i] = 0;
            } else {
                digits[i] = digits[i] + 1;
                return digits;
            }
        }
        vector<int> temp(digits.size() + 1);
        temp[0] = 1;
        return temp;
    }
};