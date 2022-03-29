 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int maxLen = matrix.size();
        int start = 0;
        int end   = maxLen;
        for (int len=maxLen; len > 1; len-=2) {
            for (int i=start, j=end-1; i < end-1; ++i, --j) {
                int first = matrix[start][i];
                matrix[start][i] = matrix[j][start];
                matrix[j][start] = matrix[end-1][j];
                matrix[end-1][j] = matrix[i][end-1];
                matrix[i][end-1] = first;
            }
            ++start;
            --end;
        }
    }
};

