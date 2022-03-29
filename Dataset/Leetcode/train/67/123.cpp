 class Solution {
public:
    string XXX(string a, string b) {
        string res = "";
        int carry = 0;
        int i = a.size() - 1, j = b.size() - 1;
        while (i >= 0 || j >= 0 || carry) {
            int bit = carry;
            if (i >= 0) {
                bit ^= (a[i] - '0');
                carry += (a[i] - '0');
            }

            if (j >= 0) {
                bit ^= (b[j] - '0');
                carry += (b[j] - '0');
            }
            
            res = to_string(bit) + res;
            carry = carry >= 2? 1: 0;
            i--;
            j--;
        }

        return res;
    }
};

