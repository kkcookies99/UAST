 class Solution {
public:
    bool XXX(TreeNode* root) {
        if (root == NULL) return true;
        return func(root->left, root->right);
    }
    bool func(TreeNode* left, TreeNode* right) {
        if (left == NULL && right == NULL) return true;
        if (left == NULL || right == NULL) return false;
        if (left->val != right->val) return false;
        if (!func(left->left, right->right)) return false;
        if (!func(left->right, right->left)) return false;
        return true;
    }
};

