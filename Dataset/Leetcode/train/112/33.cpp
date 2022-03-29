class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        return  root && ((!root->left && !root->right && root->val == sum) || (root->left && XXX(root->left, sum - root->val)) || (root->right && XXX(root->right, sum - root->val)));
    }
};

