 class Solution {
public:
    int XXX(TreeNode* root) {
        if(root==NULL)
            return 0;
        if(root->left==NULL&&root->right==NULL)
            return 1;
        int left=10000,right=10000;
        if(root->left)
            left=XXX(root->left);
        if(root->right)
            right=XXX(root->right);
        return 1+(left<right?left:right);
    }
};

