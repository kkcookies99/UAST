class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        //先上下对称一遍
        for(int i=0;i<matrix.size()/2;i++){
            for(int j=0;j<matrix.size();j++){
                swap(matrix[i][j],matrix[matrix.size()-1-i][j]);
            }
        }
        //对角线对称一次
        for(int i=0;i<matrix.size();i++){
            for(int j=i;j<matrix.size();j++){
                swap(matrix[i][j],matrix[j][i]);
            }
        }
    }
};

