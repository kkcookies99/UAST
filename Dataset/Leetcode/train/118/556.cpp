 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> ans;
        if(numRows==0) return ans;
        vector<int> temp;
        temp.push_back(1);
        ans.push_back(temp);
        if(numRows==1) return ans;
        int i,j;
        for(i=1;i<numRows;i++){
            temp.clear();
            temp.push_back(1);
            for(j=0;j<=i-2;j++){
                temp.push_back(ans[i-1][j]+ans[i-1][j+1]);
            }
            temp.push_back(1);
            ans.push_back(temp);
        }
        return ans;
    }
};

