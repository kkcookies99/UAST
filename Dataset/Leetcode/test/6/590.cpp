 class Solution {
public:
    string XXX(string s, int numRows) {
        if (numRows == 1)   return s;
        vector<string> matrix(numRows);
        int cur = 0;
        int inc = 1;
        for (int i = 0; i < s.size(); i ++) {
            matrix[cur] += s[i];
            if (cur == 0)   inc = 1;
            if (cur == numRows - 1) inc = -1;
            cur += inc;
        }
        string ans;
        for (auto s : matrix) {
            ans += s;
        }
        return ans;
    }
};

