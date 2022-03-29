 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(root == NULL) {
            return false;
        }
        sum -= root->val;
        return (0 == sum && root->left == NULL && root->right == NULL) ||
            XXX(root->left, sum) || XXX(root->right, sum);
    }
};

