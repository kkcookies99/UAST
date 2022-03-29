 class Solution {
public:
    int flag = false;
    bool XXX(TreeNode* root, int sum) {
        if (!root) return flag;
        dfs(root, 0, sum);
        return flag;
    }
    void dfs(TreeNode* root,int k,int sum) {
        k += root->val;
        if (!root->left && !root->right) {
            if (k == sum) flag = true;
        } else {
            if (root->left) dfs(root->left, k, sum);
            if (root->right) dfs(root->right, k, sum);
        }
    }
};

