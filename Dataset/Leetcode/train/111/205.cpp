class Solution {
public:
    int XXX(TreeNode* root) {
        if(!root) return 0;
        int left=XXX(root->left);
        int right=XXX(root->right);
        if(!left) return 1+right;
        else if(!right) return 1+left;
        else return 1+min(left,right);
    }
};

