class Solution {
public:
    int XXX(TreeNode* root) {
        if (root == NULL)
            return 0;
        if (root->left && root->right)
            return min(XXX(root->left), XXX(root->right)) + 1;
        else if (root->left)
            return XXX(root->left) + 1;
        else
            return XXX(root->right) + 1;
    }
};

