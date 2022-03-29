class Solution {
public:
    int XXX(TreeNode* root) {
        if(!root) return 0;
        if(!root->left && !root->right) return 1;
        if(!root->left) return (1 + XXX(root->right));
        if(!root->right) return (1 + XXX(root->left));
        return min(1 + XXX(root->left), 1 + XXX(root->right));

    }
};

