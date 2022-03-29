 class Solution {
public:
    bool XXX(TreeNode* root) {
        return helper(root, LONG_LONG_MIN, LONG_LONG_MAX);
    }

    bool helper(TreeNode* root, long long low, long long high) {
        if (!root) return true;
        if (root -> val < high && root -> val > low) {
            return helper(root -> left, low, root -> val) && helper(root -> right, root -> val, high);
        }
        return false;
    }
};

