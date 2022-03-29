class Solution {
public:
    int deep;
public:
    int XXX(TreeNode* root) {
        if(!root) return  0;

        int left=XXX(root->left);
        int right=XXX(root->right);

        return left>right ? left+deep+1:right+deep+1;
    }
};

