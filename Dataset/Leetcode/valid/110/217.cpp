class Solution {
public:
    bool XXX(TreeNode* root) {
        if (root == nullptr) return true;
        return fabs(getDepth(root->left) - getDepth(root->right)) < 2 && XXX(root->left) && XXX(root->right);
    }

    int getDepth(TreeNode* root)
    {
        if (root == nullptr) return 0;
        return max(getDepth(root->left), getDepth(root->right)) + 1;
    }
};

