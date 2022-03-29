 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> ans;
        for(int i=0;i<numRows;i++){
            vector<int> temp;
            temp.push_back(1);
            if(i>=1){
                for(int j=1;j<i;j++){
                    temp.push_back(ans[i-1][j-1]+ans[i-1][j]);
                }
                temp.push_back(1);
            }
            ans.push_back(temp);
        }
        return ans;
    }
};

