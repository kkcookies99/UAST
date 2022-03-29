 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n = matrix.size();

        int m = n / 2 + n % 2;
        int m1 = n / 2;
        for(int i = 0; i < m; i ++)
        {
            for(int j = 0; j < m1; j ++)
            {
                int tmp = 0;
                int nexti = i;
                int nextj = j;
                for(int k = 0; k < 5; k ++)
                {
                    swap(matrix[nexti][nextj], tmp);
                    swap(nexti, nextj);
                    nextj = n - 1 - nextj;
                }
            }
        }

        return;
    }
};

