class Solution {
public:
    int maxDepth(TreeNode* root) {
        if (root == NULL)
            return 0;
        return max(maxDepth(root->left), maxDepth(root->right)) + 1;
    }
    bool XXX(TreeNode* root) {
        if (root == NULL)
            return true;
        int leftDepth = maxDepth(root->left);
        int rightDepth = maxDepth(root->right);
        if (abs(leftDepth - rightDepth) > 1)
            return false;
        bool left = XXX(root->left);
        bool right = XXX(root->right);
        return left && right;
    }
};

