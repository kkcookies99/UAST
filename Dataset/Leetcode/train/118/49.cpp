 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
       for (int i = 0; i < numRows; i++) {
           //每层的两端都是1，所以直接把每层都初始化为1
            vector<int> level(i + 1, 1);
            for (int j = 1; j < level.size() - 1; j++) 
                level[j] = res[i - 1][j - 1] + res[i - 1][j];
            res.emplace_back(level);
       }
       return res; 
    }
private:
    vector<vector<int>> res;
};

