 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> ans;
        if(numRows==0) return ans;
        vector<int> result;
        result.push_back(1);
        ans.push_back(result);
        result.clear();
        if(numRows==1) return ans;
        result.push_back(1);
        result.push_back(1);
        ans.push_back(result);
        if(numRows==2) return ans;
        result.clear();
        for(int i=3;i<=numRows;i++){
            result.push_back(1);
            for(int j=1;j<i-1;++j)
                result.push_back(ans[i-2][j-1]+ans[i-2][j]);
            result.push_back(1);
            ans.push_back(result);
            result.clear();    
        }
        return ans;
    }
};

