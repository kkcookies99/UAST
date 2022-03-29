 class Solution {
public:
    int flag=0,pre=-23243;
    void inorder(TreeNode* root)
    {
        if(root!=NULL)
        {
            XXX(root->left);
            if(root->val<=pre&&pre!=-23243)flag=1;
            else pre=root->val;
            XXX(root->right);
        }
    }
    bool XXX(TreeNode* root) {
        inorder(root);
        return !flag;
    }
};

