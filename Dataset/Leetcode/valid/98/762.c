 class Solution {
    int findmin(TreeNode* root)
    {
        int res=root->val;
        while(root->left!=NULL)
        {
            root=root->left;
            res=root->val;
        }
        return res;
    }
    int findmax(TreeNode* root)
    {
        int res=root->val;
        while(root->right!=NULL)
        {
            root=root->right;
            res=root->val;
        }
        return res;
    }

public:
    bool XXX(TreeNode* root) {
        if(root==NULL||(root->left==NULL&&root->right==NULL))
            return true;
        else if(root->left==NULL&&root->right!=NULL&&(root->val<findmin(root->right)))
        {
            return XXX(root->right);
        }
        else if(root->right==NULL&&root->left!=NULL&&(root->val>findmax(root->left)))
        {
            return XXX(root->left);
        }
        else if((root->left!=NULL&&root->right!=NULL)&&root->val<findmin(root->right)&&root->val>findmax(root->left))
        {
            return XXX(root->left)&&XXX(root->right);
        }
        else
        {
            return false;
        }
        return false;
    }
};

