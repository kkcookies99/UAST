 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        return dfs(root, 0, sum);
    }
private:
    bool dfs(TreeNode* root, int sum, int target) {
        if (!root) return false;
        if (!root->left && !root->right) {
            return sum + root->val == target;
        }
        return dfs(root->left, sum + root->val, target) || dfs(root->right, sum + root->val, target);
    }
};

