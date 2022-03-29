class Solution {
public:
    int XXX(int m, int n) {
        int tmp[100][100] = {0};

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(i==0 || j==0) {
                    tmp[i][j] = 1;
                } else {
                    tmp[i][j] = tmp[i-1][j] + tmp[i][j-1];
                }
            }
        }

        return tmp[m-1][n-1];
    }
};

