 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> res;
        vector<int> row;
        
        while(numRows--){
            int i = row.size() - 1;
            row.push_back(1);
            for(;i > 0;i--){
                row[i] = row[i]+row[i-1];
            }
            res.push_back(row);
        }
        return res;
    }
};

