 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        ++digits.back();
        if(digits.back() == 10){
            int carry = 0;
            for(int i = digits.size() - 1; i >= 0; --i){
                digits[i] += carry;
                carry = digits[i] / 10;
                digits[i] = ((digits[i] - 10) >> 31) & digits[i];
                if(carry == 0) return digits;
            }
            if(carry == 1) digits.insert(digits.begin(), 1);
        }
        return digits;
    }
};

