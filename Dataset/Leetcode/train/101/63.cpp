 class Solution {
public:
    bool XXX(TreeNode* root) {
        if (!root)      return true;
        return XXX(root->left, root->right);
    }
    bool XXX(TreeNode* a, TreeNode* b) {
        if (!a && !b)    return true;
        if (!a || !b)    return false;
        return a->val == b->val && 
                XXX(a->left, b->right) && 
                XXX(a->right, b->left);
    }   
};

