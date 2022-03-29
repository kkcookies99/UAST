 class Solution {
public:
    bool assist(TreeNode *l,TreeNode* r){
        if(!l&&!r) return true;
        if(!l||!r||l->val!=r->val) return false;
        return assist(l->left,r->right)&&assist(l->right,r->left);
    }
    bool XXX(TreeNode* root) {
        return assist(root->left,root->right);
    }
};

