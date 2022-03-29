class Solution {
public:
    int XXX(TreeNode* root) {
        if(!root)
            return 0;
        int a=XXX(root->left);
        int b=XXX(root->right);
        return (a>b?a+1:b+1);
    }
};

