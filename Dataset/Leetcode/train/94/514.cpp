 class Solution {
public:
    void dfs(TreeNode *node, vector<int> & ans)
    {
        if (!node) return;
        dfs(node->left, ans);
        ans.push_back(node->val);
        dfs(node->right, ans);
    }
    vector<int> XXX(TreeNode* root) 
    {
        vector<int> ans;
        dfs(root, ans);
        return ans;
    }
};

