 class Solution {
public:
    bool XXX(TreeNode* root) {
        return check_func(root, LONG_MIN, LONG_MAX);
    } 
    bool check_func(TreeNode *root, long long lower, long long upper) {
        if (root == nullptr) return true;
        if (root->val <= lower || root->val >= upper) return false;
        return check_func(root->left, lower, root->val) && check_func(root->right, root->val, upper);
    }
};

