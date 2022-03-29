 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root)
            return true;
        return isEqual(root->left, root->right);
    }
    bool isEqual(TreeNode* l,TreeNode* r)
    {
        if(l==NULL||r==NULL)
        {
            if(l==NULL&&right==NULL)
            {
                return true;
            }
            else
                return false;
        }
        if(l->val==r->val)
        {
            return isEqual(l->left,r->right) && isEqual(l->right,r->left);
        }
        return false;
    }
};

