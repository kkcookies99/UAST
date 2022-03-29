 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root==NULL)
          return true;
        return auxisSym(root->left,root->right);
        
    }
    bool auxisSym(TreeNode* p,TreeNode* q)
    {
       if(p==NULL && q==NULL)
          return true;
     if(p!=NULL && q!=NULL && p->val == q->val)
      return auxisSym(p->left,q->right)&&auxisSym(p->right,q->left);
      else
       return false;   
    }
};

