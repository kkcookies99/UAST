 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        vector<vector<int>> cp(matrix);
        for(int i = 0; i < matrix.size(); i++) 
            for(int j = 0; j < matrix[i].size(); j++) 
                cp[j][matrix.size() - i - 1] = matrix[i][j];
        matrix = cp;
    }
};

