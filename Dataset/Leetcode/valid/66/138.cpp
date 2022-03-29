 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        for (int i = digits.size() - 1; i >= 0; i--) {
            digits[i]++ ;
            digits[i] = digits[i] <= 9 ? digits[i] : 0;
            // 如果没有进位直接 return
            if (digits[i]) return digits;
        }
        // 走出for循环都没有return，证明最高位有进位，insert一个1 再 return
        digits.insert(digits.begin(), 1);
        return digits;
    }
};

