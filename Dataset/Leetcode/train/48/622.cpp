 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n=matrix.size(),m=matrix[0].size();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                swap(matrix[i][j],matrix[j][i]);
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m/2;j++)
            {
                swap(matrix[i][j],matrix[i][m-1-j]);
            }
        }
    }
};

