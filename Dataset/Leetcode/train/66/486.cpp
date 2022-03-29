class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int carry = 1;
        int n = digits.size();
        for (int i = n - 1; i >= 0; --i) {
            digits[i] += carry;
            carry = digits[i] / 10;
            digits[i] %= 10;
        }
        if (carry) {
            vector<int> ret{1};
            for (int d : digits) {
                ret.emplace_back(d);
            }
            return ret;
        }
        return digits;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


