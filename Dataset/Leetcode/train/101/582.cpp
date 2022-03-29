 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root==NULL ) return true;        
        return  helper(root->left,root->right);
    }
    bool helper(TreeNode* l,TreeNode* r){
        if(l==NULL&&r==NULL)return true;
        if(l==NULL||r==NULL) return false;
        return r->val==l->val   && helper(l->left,r->right)&&helper(l->right,r->left);
    }
};

