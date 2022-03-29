 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int len=matrix[0].size();
        int m_len=len/2;
        for(int i=0;i<m_len;i++){
            for(int j=0;j<len;j++)
            {
               swap(matrix[i][j],matrix[len-1-i][j]);
            }
        }
        for(int i=1;i<len;i++){
            for(int j=0;j<i;j++)
            {
               swap(matrix[i][j],matrix[j][i]);
            }
        }
    }
};

