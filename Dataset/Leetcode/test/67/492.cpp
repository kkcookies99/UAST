class Solution {
public:
    // 固定模板，建议记住
    string XXX(string a, string b) {
        string ret;
        int i = a.size() - 1, j = b.size() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            carry += i >= 0 ? a[i--] - '0' : 0;
            carry += j >= 0 ? b[j--] - '0' : 0;
            ret.push_back(carry % 2 + '0');
            carry /= 2;
        }
        reverse(ret.begin(), ret.end());
        return ret;
    }
};

