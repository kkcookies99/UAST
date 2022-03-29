class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n = matrix.size();
        int tmp = 0;
        for(int i=0,j=n-1;i<j;i++,j--){
           vector<int> tmp = matrix[i];
           matrix[i] = matrix[j];
           matrix[j] = tmp;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }
};

