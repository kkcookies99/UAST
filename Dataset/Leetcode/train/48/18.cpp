class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n = matrix.size()-1;
        for(int i=0; i<(n+1)/2; i++){
            for(int j=i; j<n-i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-j][i];
                matrix[n-j][i] = matrix[n-i][n-j];
                matrix[n-i][n-j] = matrix[j][n-i];
                matrix[j][n-i] = temp;
            }
        }
    }
};

