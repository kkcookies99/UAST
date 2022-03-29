 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> res;

        for(int i=0; i < numRows; i++){
            vector<int> row = vector<int>(i+1);
            for(int j = 0; j < row.size(); j++){
                if(j==0 || j == row.size() - 1){
                    row[j] = 1;
                }else{
                    row[j] = res[i-1][j] + res[i-1][j-1];
                }
            }
            res.push_back(row);
        }

        return res;
    }
};

