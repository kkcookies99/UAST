class Solution {
public:
    int dfs(TreeNode* root) {
        if (root == NULL)
            return 0;
        return max(dfs(root->left), dfs(root->right)) + 1;
    }
    int XXX(TreeNode* root) {
        return dfs(root);
    }
};

