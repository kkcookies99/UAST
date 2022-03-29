 class Solution {
public:
    bool SameNode(TreeNode *p,TreeNode *q)
    {
        if(p&&q)
          return ((p->val==q->val)&&SameNode(p->left,q->right)&&SameNode(p->right,q->left));
        else if(p==NULL&&q==NULL)
         return true;
        else return false;
    }
    bool XXX(TreeNode* root) {
       TreeNode *p, *q;
       if(root)
       {
        p=root->left;
        q=root->right;
        return SameNode(p,q);
       } 
       else return true;
    }
};

