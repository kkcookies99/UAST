 class Solution {
public:
    string XXX(string s, int numRows) {
        vector<string> rows(numRows);
        int row = 0;
        bool down = true;
        for (int i = 0; i < s.length(); i++) {
            rows[row] += s[i];
            if (down) {
                if (row == numRows - 1) {
                    row = max(0, row - 1);
                    down = false;
                } else {
                    row = min(numRows - 1, row + 1);
                }
            } else {
                if (row == 0) {
                    row = min(numRows - 1, row + 1);
                    down = true;
                } else {
                    row = max(0, row - 1);
                }
            }
        }
        string ans = "";
        for (int i = 0; i < rows.size(); i++) {
            ans += rows[i];
        }
        return ans;
    }
};

