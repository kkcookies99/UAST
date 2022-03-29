class Solution {
public:
    int res;
    int XXX(int m, int n) {
        vector<vector<int>> store(m,vector<int> (n,0));
        for(int i=0;i<m;i++){
            store[i][0]=1;
        }
        for(int i=0;i<n;i++)
    {
        store[0][i]=1;
    }
    for(int i=1;i<m;i++){
        for(int j=1;j<n;j++){
            store[i][j] = store[i-1][j]+store[i][j-1];
        }
    }
        return store[m-1][n-1];
    }
};

