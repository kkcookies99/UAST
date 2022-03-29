class Solution {
public:
    int XXX(TreeNode* root) {
        if (root == NULL) return 0;
        if (root->left == NULL && root->right != NULL) {
            return 1 + XXX(root->right);
        }
        if (root->left != NULL && root->right == NULL) {
            return 1 + XXX(root->left);
        }
        return 1 + min(XXX(root->left), XXX(root->right));
    }
};

