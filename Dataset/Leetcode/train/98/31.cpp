 class Solution {
public:
    bool helper(TreeNode* root,int low,int high)
    {
        if(root==nullptr)
            return true;

        bool f1=true,f2=true;

        if((root->val)>low && (root->val)<high)
        {
            if(root->left!=nullptr)
            {
                f1=helper(root->left,low,root->val);
            }
            if(root->right!=nullptr)
            {
                f2=helper(root->right,root->val,high);
            }
            return (f1&&f2);
        }
        else
            return false;
    }
    bool XXX(TreeNode* root) {
        return helper(root,LLONG_MIN,LLONG_MAX);
    }
};

