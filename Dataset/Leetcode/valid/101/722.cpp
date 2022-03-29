 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root == NULL) return true;
        return isSame(root->left, root->right);
    }

    bool isSame(TreeNode *left, TreeNode *right)
    {
        if(left == NULL && right == NULL)
            return true;
        if(left && right && left->val == right->val)
            return isSame(left->left, right->right) && isSame(left->right, right->left);
        else
            return false;
    }
};

