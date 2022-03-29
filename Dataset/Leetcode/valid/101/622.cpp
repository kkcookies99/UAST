 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root == NULL) 
            return true;    
        return issame(root->left,root->right);
    }

    bool issame(TreeNode* p, TreeNode* q)
    {
         if(p == NULL && q == NULL)
            return true;
        else if(p == NULL || q == NULL)
            return false;
        
        if(p->val == q->val && issame(p->left, q->right) && issame(p->right,q->left))
            return true;
        else
            return false;
    }
};

