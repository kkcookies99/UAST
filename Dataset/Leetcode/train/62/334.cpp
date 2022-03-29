 class Solution {
public:
    int XXX(int m, int n) {
        vector<vector<int>>v(m,vector<int>(n,0));
        vector<vector<int>>mem(m,vector<int>(n,0));
        return dfs(v,mem,0,0);
    }


    int dfs(vector<vector<int>>&v,vector<vector<int>>&mem,int i,int j){
        if(i>=v.size() || j>=v[0].size() || v[i][j]==1) return 0;
        if(i==v.size()-1&&j==v[0].size()-1) return 1;
        if(mem[i][j]!=0) return mem[i][j];
        else{
            v[i][j] = 1;
            int d = dfs(v,mem,i+1,j);
            int r = dfs(v,mem,i,j+1);
            mem[i][j] = d+r;
            v[i][j] = 0;
            return mem[i][j];
        }
    }
};

