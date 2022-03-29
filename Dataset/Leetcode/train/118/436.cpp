 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> res(numRows);
        for(int i = 0; i < numRows; ++i){
            vector<int> temp(i+1);
            for(int j = 0; j <= i; ++j){
                if(j == 0 || j == i){
                    temp[j] = 1;
                }
                else{
                    temp[j] = res[i - 1][j - 1] + res[i - 1][j];
                }
            }
            res[i] = temp;
        }
        return res;
    }
};

