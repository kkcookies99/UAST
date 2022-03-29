class Solution {
public:
    int XXX(int m, int n) {
        if(m==1||n==1) return 1;
        vector<vector<int>> v(m,vector<int>(n,0));
        v[0][1]=1;
        v[1][0]=1;
        for(int i=0;i<m;i++){
            for(int ii=0;ii<n;ii++){
                if(i-1>=0) v[i][ii]+=v[i-1][ii];
                if(ii-1>=0) v[i][ii]+=v[i][ii-1];
            }
        }
        return v[m-1][n-1];
    }
};

