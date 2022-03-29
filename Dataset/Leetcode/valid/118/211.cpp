 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>>ans;
        for(int i=0;i<numRows;++i){
            vector<int>res;
            for(int j=0;j<=i;++j){
                if(j==0||j==i) res.push_back(1);
                else res.push_back(ans[i-1][j-1]+ans[i-1][j]);
            }
            ans.push_back(res);
        }
        return ans;
    }
};

