 class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if(root == NULL) return false;
        if(targetSum - root->val == 0 && !root->left && !root->right) return true;
        return XXX(root->left, targetSum - root->val) || XXX(root->right, targetSum - root->val);
    }
};

