class Solution {
public:
    string XXX(string a, string b) {
        string ans = "";
        int i = a.length() - 1, j = b.length() - 1, k = 0;
        while (i >= 0 || j >= 0) {
            int temp = k;
            if (i >= 0) {
                temp += a[i--] - '0';
            }
            if (j >= 0) {
                temp += b[j--] - '0';
            }
            k = temp > 1 ? 1 : 0;
            ans = (char)((temp % 2) + '0') + ans;
        }
        return k ? "1" + ans : ans;
    }
};

