class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> res;
        dfs(res, root, 0);
        return res;
    }
    void dfs(vector<vector<int>>& res, TreeNode* root, int level) {
        if (!root) return;
        if (level >= res.size())
            res.push_back(vector<int>());
        res[level].push_back(root->val);
        dfs(res, root->left, level + 1);
        dfs(res, root->right, level + 1);
    }
};

