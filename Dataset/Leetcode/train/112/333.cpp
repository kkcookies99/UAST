 class Solution {
public:
    bool XXX(TreeNode *root, int targetSum) {
        if (!root)  return false;
        if (!root->left && !root->right)  return (targetSum - root->val) == 0;
        return XXX(root->left, targetSum - root->val)|| XXX(root->right, targetSum - root->val);
    }
};

