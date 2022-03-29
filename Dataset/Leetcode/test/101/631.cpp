 class Solution {
public:
    bool fun(TreeNode*l,TreeNode*r)
    {
        if(l==NULL&&r==NULL) return true;
        else if(l!=NULL&&r!=NULL)
        {
            if(l->val==r->val) return fun(l->left,r->right)&&fun(l->right,r->left);
            else return false;
        }
        else return false;
    }
    bool XXX(TreeNode* root) {
        if(root==NULL) return true;
        else return fun(root->left,root->right);
    }
};

