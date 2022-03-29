 class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if(!root) return false;
        if(!root->right && !root->left) return (root->val==targetSum);
        return XXX(root->right,targetSum - root->val)
        || XXX(root->left, targetSum - root->val);
    }
};

