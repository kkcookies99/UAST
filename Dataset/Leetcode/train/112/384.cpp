 class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if (!root) return false;
        if (!root->left && !root->right && targetSum - root->val == 0) return true;
        return XXX(root->left, targetSum - root->val) 
                || XXX(root->right, targetSum - root->val);
    }
};

