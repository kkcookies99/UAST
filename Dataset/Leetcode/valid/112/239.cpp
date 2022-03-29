 class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if (root == nullptr) {
            return false;
        }
        targetSum -= root->val;
        if (root->left == nullptr && root->right == nullptr) {
            return targetSum == 0 ? true : false;
        }
        return XXX(root->left, targetSum) || XXX(root->right, targetSum);
    }
};

