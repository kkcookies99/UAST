 class Solution {
public:
    bool XXX(TreeNode* root) {
       if(root==NULL) return true;
        int lefthigh=depth(root->left);
        int righthigh=depth(root->right);
        if(abs(lefthigh-righthigh)>1)
            return false;
        return XXX(root->left)&&XXX(root->right);
    }
    int depth(TreeNode*root)
    {
        if(root==NULL) return 0;
        else
        {
            int left=depth(root->left);
            int right=depth(root->right);
            return 1+(left>right?left:right);
        }
    }
};

