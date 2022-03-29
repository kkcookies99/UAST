class Solution {
public:
    int helper(TreeNode* root, int depth, bool& flag) {
        if (root == nullptr)
            return depth;
        depth += 1;
        int left = helper(root->left, depth, flag);
        int right = helper(root->right, depth, flag);
        if (!flag)
            return 0;
        if (abs(left - right) > 1) {
            flag = false;
            return 0;
        }
        return max(left, right);
    }
    bool XXX(TreeNode* root) {
        if (root == nullptr)
            return true;
        bool flag = true;
        helper(root, 0, flag);
        return flag;
    }
};