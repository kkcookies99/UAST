 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> ans;
        int i=0;
        while(i++<numRows){
            vector<int> temp(i,1);
            if(i>2){
                for(int j=1;j<i-1;j++){
                    temp[j]=ans[i-2][j-1]+ans[i-2][j];
                }
            }
            ans.push_back(temp);
        }
        return ans;
    }
};

