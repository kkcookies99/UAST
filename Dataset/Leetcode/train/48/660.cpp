 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        vector<vector<int>> matrix_temp = matrix;
        int n= matrix.size();
        int k;
        for(int i=n-1;i>=0;i--){
            k=n-i-1;
            for(int j=0;j<n;j++){
                matrix[j][k] = matrix_temp[i][j];
            }
        }
    }
};

