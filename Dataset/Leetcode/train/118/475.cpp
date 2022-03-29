 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        if(numRows == 0){
            return vector<vector<int>>();
        }
        if(numRows == 1){
            return vector<vector<int>>{{1}};
        }
        int ct = 1;  //每层有ct个数需要规律算出
        vector<vector<int>> res;
        res.emplace_back(vector<int>{1});
        res.emplace_back(vector<int>{1,1});
        for(int i = 2; i < numRows; ++i){
            vector<int> temp(ct + 2, 1);
            for(int j = 1; j <= ct; ++j){
                //每层
                temp[j] = res[i - 1][j - 1] + res[i - 1][j];
            }
            res.emplace_back(temp);
            ++ct;
        }
        return res;
    }
};

