class Solution {
public:
    int XXX(TreeNode* root) {
        if(!root)
            return 0;
        int left=XXX(root->left),right=XXX(root->right);
        return (left && right) ? 1+min(left,right):1+left+right;
    }
};

