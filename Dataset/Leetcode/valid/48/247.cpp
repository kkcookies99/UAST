class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        for(int i = 0; i < matrix.size();i++)
            for(int j = 0; j < i; j++)
                swap(matrix[i][j],matrix[j][i]);
        for(int i = 0; i < matrix.size(); i++)
            for(int j = 0, k = matrix[i].size()-1; j  < k; j++,k--)
                swap(matrix[i][j],matrix[i][k]);
    }
};


