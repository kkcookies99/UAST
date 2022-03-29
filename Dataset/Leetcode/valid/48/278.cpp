class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        for(int i=0;i<matrix.size();i++){
            for(int j=0;j<i;j++){
                matrix[i][j] = matrix[i][j]^matrix[j][i];
                matrix[j][i] = matrix[i][j]^matrix[j][i];
                matrix[i][j] = matrix[i][j]^matrix[j][i];
            }
        }
        for(int i=0;i<matrix.size();i++){
            for(int j=0;j<matrix[0].size()/2;j++){
                //交换
                matrix[i][j]  = matrix[i][j] ^ matrix[i][matrix.size()-1-j];
                matrix[i][matrix.size()-1-j]  = matrix[i][j] ^ matrix[i][matrix.size()-1-j];
                matrix[i][j]  = matrix[i][j] ^ matrix[i][matrix.size()-1-j];
            }
        }
    }
};

