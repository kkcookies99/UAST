 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        int i, j;
        vector<vector<int>> Ret(numRows);
        for (i = 0; i < numRows; ++i) {
            vector<int> Row(i + 1);
            Row[0] = 1;
            for (j = 1; j < i; ++j) {
                Row[j] = Ret[i - 1][j] + Ret[i - 1][j - 1];
            }
            if (i) {
                Row[i] = 1;
            }
            Ret[i] = Row;
        }
        return Ret;
    }
};

