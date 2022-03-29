 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n = matrix.size(), t, x, y;
        for(int i = 0; i < n/2; i++){
            for(int j = i; j < n-i-1; j++){
                x = j, y = n - 1 - i;
                while(x!=i || y!=j){
                    t = matrix[i][j]; matrix[i][j] = matrix[x][y]; matrix[x][y] = t;
                    t = x; x = y; y = n - 1 - t;
                }
            }
        }
    }
};

