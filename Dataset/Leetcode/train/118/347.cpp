 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>>f;
        for(int i=0;i<numRows;i++){
            vector<int>res(i+1);
            res[i]=res[0]=1;
            for(int j=1;j<i;j++){
                res[j]=f[i-1][j-1]+f[i-1][j];
            }
            f.push_back(res);
        }
        return f;
    }
};

