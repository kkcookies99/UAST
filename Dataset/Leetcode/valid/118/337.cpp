 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>>ret;

        ret.push_back({1});
        for(int i = 1;i < numRows;i++){
            vector<int> temp;
            for(int j = 0;j < i + 1;j++){
                if(j == 0||j == i)temp.push_back(1);
                else temp.push_back(ret[i - 1][j - 1] + ret[i - 1][j]);
            }
            ret.push_back(temp);
        }
        return ret;
    }
};

