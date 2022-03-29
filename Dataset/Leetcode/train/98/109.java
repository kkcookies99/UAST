 class Solution {
    long maxValue(TreeNode* root) {
        if (root == nullptr) return LONG_MIN;
        return max(max((long) root->val, maxValue(root->left)), maxValue(root->right));
    }
    long minValue(TreeNode* root) {
        if (root == nullptr) return LONG_MAX;
        return min(min((long) root->val, minValue(root->left)), minValue(root->right));
    }
public:
    bool XXX(TreeNode* root) {
        if (root == nullptr) return true;
        if (root->left == nullptr && root->right == nullptr) return true;
        return maxValue(root->left) < root->val
            && minValue(root->right) > root->val
            && XXX(root->left) && XXX(root->right);
    }
};

