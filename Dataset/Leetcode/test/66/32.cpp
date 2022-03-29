 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        bool carry = false;
        for (int i = digits.size() - 1; i >= 0; --i) {
            int &n = digits[i];
            if (i == digits.size() - 1) { // first time
                ++n;
            }  
            if (carry) { // 判断是否进位
                ++n;
            }  
            if (n == 10) { // 进位之后是不是继续进位
                carry = true;
                n = 0;
            } else {
                carry = false;
            }         
        }
        if (carry) {
            digits.insert(digits.begin(), 1);
        }
        return digits;
    }
};

