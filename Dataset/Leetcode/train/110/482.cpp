class Solution {
public:
    int height(TreeNode *root) {
        if (!root) return 0;
        int leftHeight = height(root->left), rightHeight = height(root->right);
        if (leftHeight >= 0 && rightHeight >= 0 && abs(leftHeight - rightHeight) <= 1)
            return max(leftHeight, rightHeight) + 1;
        return -1; 
    }

    bool XXX(TreeNode* root) {
        return height(root) >= 0;   //-1表示不平衡 
    }
};

