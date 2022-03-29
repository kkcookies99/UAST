class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n = matrix.size();
        //置换
        for(int i = 0;i < n; i++){
            for(int j = 0;j < i; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        //反转
        for(int i = 0; i < n; i++){
            reverse(matrix[i].begin(), matrix[i].end());
        }
    }
};

