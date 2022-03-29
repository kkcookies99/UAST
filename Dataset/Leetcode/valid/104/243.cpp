class Solution {
public:
    int XXX(TreeNode* root) {
        return !root ? 0 : max(root->left ? XXX(root->left) : 0, root->right ? XXX(root->right) : 0)  + 1;
    }
};

