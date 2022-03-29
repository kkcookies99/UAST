class Solution {
public:
    int get_len(TreeNode* root) {
        if (!root) {
            return 0;
        }
        int left = get_len(root->left);
        int right = get_len(root->right);
        if (left == -1 || right == -1 || abs(left - right) > 1) {
            return -1;
        }
        return max(left, right) + 1;
    }
    bool XXX(TreeNode* root) {
        return get_len(root) >= 0;
    }
};

