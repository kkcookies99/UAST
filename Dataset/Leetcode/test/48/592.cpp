 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        for(int i = 0;i < matrix.size();i++){
            for(int j = i;j < matrix[i].size();j++){
                swap(matrix[i][j],matrix[j][i]);
                //cout << i << " " << j << endl;
            }
            for(int k = 0;k < matrix[i].size() / 2;k++){
                swap(matrix[i][k],matrix[i][matrix.size() - 1 - k]);
            }
        }
    }
};

