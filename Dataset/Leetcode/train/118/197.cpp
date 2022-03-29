 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> ans;
        vector<int> row;
        row.emplace_back(1);
        ans.emplace_back(row);
        if(numRows==1){
            return ans;
        }
        row.emplace_back(1);
        ans.emplace_back(row);
        if(numRows==2){
            return ans;
        }
        for(int i=3;i<=numRows;++i){
            row.emplace_back(1);
            for(int j=i-2;j>0;--j){
                row[j]=row[j]+row[j-1];
            }
            ans.emplace_back(row);
        }
        return ans;
    }
};

