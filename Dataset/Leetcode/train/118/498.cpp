 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> res;
        if(!numRows) return res;
        for(int i=0;i<numRows;i++){
            vector<int> v(i+1,1);
            if(i>=2){
                for(int j=1;j<=i-1;j++)
                    v[j] = res[i-1][j-1]+res[i-1][j];
            }
            res.push_back(v);
        }
        return res;
    }
};

