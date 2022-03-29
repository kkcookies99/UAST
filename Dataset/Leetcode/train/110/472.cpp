class Solution {
public:
    int getHeight(TreeNode* root) {
        if (!root) return 0;
        int leftHeight = getHeight(root->left);
        int rightHeight = getHeight(root->right);
        return max(leftHeight, rightHeight) + 1;
    }
    int getFactor(TreeNode* root) {
        return getHeight(root->left) - getHeight(root->right);
    }

    bool XXX(TreeNode* root) {
        if (!root) return true;
        bool l = XXX(root->left);
        bool r = XXX(root->right);
        if (abs(getFactor(root)) >= 2) return false;
        else return l && r;
    }
};

