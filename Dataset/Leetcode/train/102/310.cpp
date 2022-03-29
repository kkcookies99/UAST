class Solution {
public:
    vector<vector<int>> res;
    vector<vector<int>> XXX(TreeNode* root) {
        dfs(root, 0);
        return res;
    }

    void dfs(TreeNode* node, int level) {
        if (!node) return;
        if (res.size() <= level) {
            vector<int> lvl;
            res.push_back(lvl);
        }
        res[level].push_back(node->val);
        if (node->left) 
            dfs(node->left, level + 1);
        if (node->right)
            dfs(node->right, level + 1);
    }
};

