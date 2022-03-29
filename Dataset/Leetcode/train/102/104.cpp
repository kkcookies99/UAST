class Solution {
public:
    vector<vector<int>> res;
    void dfs(TreeNode* root, int depth)
    {
        if(!root) return;
        if(res.size() == depth) res.push_back({});
        res[depth].push_back(root->val);
        dfs(root->left, depth + 1);
        dfs(root->right, depth + 1);
    }

    vector<vector<int>> XXX(TreeNode* root) {
        dfs(root, 0);
        return res;
    }
};

