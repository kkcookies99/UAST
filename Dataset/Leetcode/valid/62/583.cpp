class Solution {
public:
    int XXX(int n, int m) {
        vector<vector<int>> array(n, vector<int>(m, 1));
        for (int i = 1; i < n; i++) 
            for (int j = 1; j < m; j ++) 
                array[i][j] = array[i-1][j] + array[i][j - 1];
        return array[n-1][m-1];
    }
};

