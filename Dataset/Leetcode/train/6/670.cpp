 class Solution {
public:
    string XXX(string s, int numRows) {
        if (numRows == 1) return s;
        int len = s.length();
        int d = 2 * numRows - 2;
        int maxj = ceil(len / d);
        string ans = "";
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= maxj; j++) {
                int p0 = j * d + i;
                if (p0 < len) ans += s[p0];
                if (i > 0 && i < numRows - 1) {
                    int p1 = p0 + 2 * (numRows - 1 - i) ;
                    if (p1 < len) ans += s[p1];
                }
            }
        }
        return ans;
    }
};

