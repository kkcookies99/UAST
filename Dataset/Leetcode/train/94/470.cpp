 class Solution {
public:

    vector<int> XXX(TreeNode* root) {
        vector<int> res;
        dfs(root, res);
        return res;
    }

    TreeNode* dfs(TreeNode* root, vector<int>& res)
    {
        if (root == nullptr) return nullptr;
        dfs(root->left, res);
        res.push_back(root->val);
        dfs(root->right, res);

        return root;
    }
};

