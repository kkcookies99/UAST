 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int const size = matrix.size();
        if (size > 0) 
        {

            for (int i = 0; i < size; ++i)
            {
                for (int j = i + 1; j < size; ++j)
                {
                    swap(matrix[i][j], matrix[j][i]);
                }
            }

            for (auto & row : matrix) 
            {
                reverse(row.begin(), row.end());
            }
            
        }
    }
};

