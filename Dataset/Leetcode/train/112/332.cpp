 class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if (!root) return false;
        targetSum -= root->val;
        if (!root->left && !root->right && !targetSum) return true;
        return XXX(root->left, targetSum) || XXX(root->right, targetSum);
    }
};

