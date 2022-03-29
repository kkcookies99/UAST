 class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if(!root)
            return false;
        return (targetSum - root->val == 0 && !root->left && !root->right) ||
                 XXX(root->left, targetSum - root->val) || 
                 XXX(root->right, targetSum - root->val);
    }
};

