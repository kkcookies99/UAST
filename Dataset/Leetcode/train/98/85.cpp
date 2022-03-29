 class Solution {
public:
    bool helper(TreeNode* root, long l, long r) {
        if (root == nullptr) {
            return true;
        }
        if (root->val >= r || root->val <= l) {
            return false;
        }
        return helper(root->left, l, root->val) && helper(root->right, root->val, r);
    }
    bool XXX(TreeNode* root) {
        return helper(root, LONG_MIN, LONG_MAX);
    }
};

