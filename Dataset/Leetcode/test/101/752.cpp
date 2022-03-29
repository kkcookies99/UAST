 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root) return true;
        return XXX(root->left,root->right);
    }
    bool XXX(TreeNode* l,TreeNode* r){
        if(!l&&r||(l&&!r)||(l&&r&&l->val!=r->val)) return false;
        if(!l&&!r) return true;
        if(!XXX(l->left,r->right)||!XXX(l->right,r->left)) return false;
        return true;
    }
};

