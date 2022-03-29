class Solution {
public:
    string XXX(string a, string b) {
        string ans;
        int i = a.size() - 1, j = b.size() - 1;
        int carry = 0;
        while (i >= 0 && j >= 0) {
            int val = (a[i] - '0' + b[j] - '0' + carry);
            carry = val >= 2 ? 1 : 0;
            ans = char('0' + val % 2) + ans;
            i--;
            j--;
        }
        while (i >= 0) {
            int val = (a[i] + carry - '0');
            carry = val >= 2 ? 1 : 0;
            ans = char('0' + val % 2) + ans;
            i--;
        }
        while (j >= 0) {
            int val = (b[j] + carry - '0');
            carry = val >= 2 ? 1 : 0;
            ans = char('0' + val % 2) + ans;
            j--;
        }
        if (carry) ans = '1' + ans;
        return ans;
    }
};

