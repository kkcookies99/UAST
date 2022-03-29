class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n = matrix.size();
        int endi = n  / 2;
        for (int i = 0; i < endi; ++i)
        {
            int endj = n - i - 1;
            for (int j = i; j < endj; ++j)
            {
                int a = n - i - j - 1;
                int b = j - i;

                int x = j, y = i;
                int temp = matrix[x][y];
                for (int k = 0; k < 3; ++k)
                {
                    matrix[x][y] = matrix[x + a][y + b];
                    x += a;
                    y += b;
                    swap(a, b);
                    a = -a;
                }
                matrix[x][y] = temp;
            }
        }
    }
};

