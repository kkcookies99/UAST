 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root) return true;
        return XXX(root->left, root->right);
    }

    bool XXX(TreeNode* left, TreeNode* right) {
        if(!left && !right) return true;
        if(!left || !right || left->val != right->val) return false;
        return XXX(left->left, right->right) && XXX(left->right, right->left);
    }
};

