 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> ans;
        vector<int> myVec;
        ans.reserve(numRows);
        myVec.reserve(numRows);
        for(int i=1; i<=numRows; ++i){
            myVec.push_back(1);
            for(int j=myVec.size()-2;j>0;--j){
                myVec[j]+=myVec[j-1];
            }
            ans.emplace_back(myVec);
        }
        return ans;
    }
};

