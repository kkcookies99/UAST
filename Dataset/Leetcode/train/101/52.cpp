 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(NULL == root) return true;
        return isMirror(root->left, root->right);
    }

    bool isMirror(TreeNode* l, TreeNode* r)
    {
        if(NULL == l && NULL == r) return true;
        if(NULL != l && NULL == r) return false;
        if(NULL == l && NULL != r) return false;
        if(l->val != r->val) return false;
        return isMirror(l->left, r->right) && isMirror(l->right, r->left);
    }
};

