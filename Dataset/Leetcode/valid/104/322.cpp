class Solution {
public:
    int XXX(TreeNode* root) {
        if(root==nullptr) return 0;
        int l=0,r=0;
        if(root->left) l=XXX(root->left);
        if(root->right) r=XXX(root->right);
        return max(l+1,r+1);
    }
};

