class Solution {
public:
    string XXX(string a, string b) {
        int len = max(a.size(), b.size());
        string ans(len, '0');
        int carry = 0;
        for(int i = a.size() - 1, j = b.size() - 1; i >= 0 || j >= 0; --i, --j)
        {
            int x = i >= 0 ? a.at(i) - '0' : 0;
            int y = j >= 0 ? b.at(j) - '0' : 0;
            ans.at(--len) += x ^ y ^ carry;
            carry = ((x ^ y) & carry) ^ (x & y);
        }

        return carry ? "1" + ans : ans;
    }
};

