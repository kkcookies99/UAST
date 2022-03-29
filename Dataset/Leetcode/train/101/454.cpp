 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root) return true;
        return judge(root->left,root->right);
    }
    bool judge(TreeNode* l,TreeNode* r){
        if(!l&&!r) return true;
        if(!l||!r) return false;
        if(l->val!=r->val) return false;
        return judge(l->right,r->left)&&judge(l->left,r->right);
    }
};

