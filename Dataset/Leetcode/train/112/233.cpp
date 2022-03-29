 class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if (!root) return false;
        targetSum -= root->val;
        return !targetSum && !root->left && !root->right || XXX(root->left, targetSum) || XXX(root->right, targetSum);
    }
};

