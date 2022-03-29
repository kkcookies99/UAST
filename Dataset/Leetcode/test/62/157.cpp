 class Solution {
public:
    int XXX(int m, int n) {
        if(m == 0 || n == 0){
            return 0;
        }
        vector<vector<int>> val;
        val.resize(m);
        for(int i = 0; i < m; ++i){
            val[i].resize(n);
            for(int j = 0; j < n; ++j){
                if(i==0 || j==0){
                    val[i][j] = 1;
                } else{
                    val[i][j] = val[i][j-1] + val[i-1][j];
                }
            }
        }
        return val[m-1][n-1];
    }
};

