class Solution {
public:

    vector<vector<int>> res;

    vector<int> nums;

    int path[22];// 记录从root到叶子的一条路径上的一种全排列结果
    bool st[22];// 记录某结点是否访问过

    // u为全排列的下标，从0开始一直到数组大小
    void dfs(int u) {
        // 如果u走到底了，说明dfs到了叶结点，为一种全排列，加入res
        if(u == nums.size()) {
            vector<int> tmp;
            for(int i = 0; i < nums.size(); ++i)
                tmp.push_back(path[i]);
            
            res.push_back(tmp);
        }

        for(int i = 0; i < nums.size(); ++i)
            if(!st[i]) {
                path[u] = nums[i];
                st[i] = true;

                dfs(u + 1);

                st[i] = false;
            }
    }

    vector<vector<int>> XXX(vector<int>& numss) {
        nums = numss;
        dfs(0);
        return res;
    }
};

