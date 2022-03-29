 class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> res;
        traverse(root, 1, res);
        return res;
    }
    void traverse(TreeNode *root, size_t level, vector<vector<int>> &res) {
        if (!root) return;
        if (level > res.size())
            res.push_back(vector<int>());
            res[level-1].push_back(root->val);
            traverse(root->left, level + 1, res);
            traverse(root->right, level + 1, res);
    }
};
