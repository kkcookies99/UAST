class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int row=matrix.size(),col=matrix[0].size();
        for(int i=1;i<row;i++){
            for(int j=0;j<i;j++){
                swap(matrix[i][j],matrix[j][i]);
            }
        }
        for(int i=0;i<row;i++){
            reverse(matrix[i].begin(),matrix[i].end());
        }
    }
};

