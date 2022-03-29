 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> ans;
        int i = 0;
        while(i++<numRows){
            vector<int> temp(i,1);
            if(i > 2){
                int k = 1;
                for(auto j = ans.back().begin(); j != ans.back().end()-1; j++){
                    temp[k] = *j + *(j+1);
                    k++;
                }
            }
            ans.push_back(temp);
        }
        return ans;
    }
};```

