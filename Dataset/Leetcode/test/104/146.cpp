class Solution {
public:
    int XXX(TreeNode* root) {
        if (root == NULL) {
            return 0;
        }
        if (XXX(root->left)>=XXX(root->right))
            return XXX(root->left) + 1;
        else
            return XXX(root->right) + 1;
    }
};

