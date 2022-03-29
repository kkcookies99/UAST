class Solution {
public:
    int dfs(TreeNode* root) {
        if (root == NULL)
            return 0;
        int leftTree = dfs(root->left);
        int rightTree = dfs(root->right);
        return max(leftTree, rightTree) + 1;
    }
    int XXX(TreeNode* root) {
        return dfs(root);
    }
};

