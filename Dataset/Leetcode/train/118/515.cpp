 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> res;res.resize(numRows);
        if(numRows<0)return res;
        for(int i=0;i<numRows;i++){
            if(i==0){
                res[i].push_back(1);
                continue;
            }
            res[i].push_back(1);
            for(int j=0;j<i-1;j++){
                res[i].push_back(res[i-1][j]+res[i-1][j+1]);
            }
            res[i].push_back(1);
        }
        return res;
    }
};

