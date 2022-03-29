 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> ans;
        vector<int> temp;
        for(int i = 1; i <= numRows; ++i) {
            temp.assign(i, 1); // 第 i 行 有 i个元素
            for(int j = 1; i > 2 && j < i - 1 ; ++j) {
                temp[j] = ans[i - 2][j-1] + ans[i - 2][j]; // 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
            }
            ans.emplace_back(temp);
        }
        return ans;
    }
};

