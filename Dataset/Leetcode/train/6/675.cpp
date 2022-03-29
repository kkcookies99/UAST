 class Solution {
public:
    string XXX(string s, int numRows) {
        int n = s.length();

        if (numRows == 1 || numRows >= n) return s;

        vector<vector<char>> a(numRows, vector<char>(n, 0));
        int x = 0, y = 0;

        for (int i = 0; i < n; ++i) {
            a[y][x] = s[i];

            if (y == 0) ++y;
            else if (y == numRows - 1 || a[y - 1][x] == 0) --y, ++x;
            else ++y;
        }

        string ans;

        for (int i = 0; i < numRows; ++i)
            for (int j = 0; j <= x; ++j)
                if (a[i][j] != 0) ans = ans + a[i][j];
        
        return ans;
    }
};

