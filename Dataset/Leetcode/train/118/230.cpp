 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> result;
        vector<int>res;
        for(int i=0;i<numRows;i++){
            for(int j=0;j<=i;j++){
                if(j==0||j==i)
                    res.push_back(1);
                else
                    res.push_back(result[i-1][j]+result[i-1][j-1]);
            }
            result.push_back(res);
            res.clear();
        }
        return result;
    }
};```

