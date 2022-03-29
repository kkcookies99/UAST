class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n = matrix.size();
        vector<vector<int>> m = matrix;
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
            {
                matrix[j][(n-1)-i] = m[i][j];
            }
    }
};

