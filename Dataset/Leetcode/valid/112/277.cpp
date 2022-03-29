 class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if(!root)
            return false;
        targetSum -= root->val;
        if(targetSum == 0 && !root->left && !root->right)
            return true;
        return XXX(root->left, targetSum) || XXX(root->right, targetSum);
    }

};

