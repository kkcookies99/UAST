class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> ans;
        pre(root, 0, ans);
        return ans;
    }
    
    void pre(TreeNode *root, int depth, vector<vector<int>> &ans) {
        if (!root) return ;
        if (depth >= ans.size())
            ans.push_back(vector<int> {});
        ans[depth].push_back(root->val);
        pre(root->left, depth + 1, ans);
        pre(root->right, depth + 1, ans);
    }
};

