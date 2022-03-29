 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> res(numRows);
        res[0].push_back(1);
        for(int i=1;i<numRows;i++){
            res[i].push_back(1);
            for(int j=1;j<=i;j++){
                res[i].push_back(res[i][j-1]*(i-j+1)/j);
            }
        }
        return res;
    }
};

