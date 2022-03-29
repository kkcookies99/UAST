 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> a(numRows);
        if (numRows == 0)  return a;
        a[0] = {1};
        for (int i=1; i<numRows; i++) {
            a[i].resize(i+1);
            for (int j=0; j<i+1; j++) {
                a[i][j] = (j<i ? a[i-1][j] : 0) + (j>0 ? a[i-1][j-1] : 0);
            }
        }
        return a;
    }
};

