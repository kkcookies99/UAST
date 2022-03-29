 class Solution {
public:
    bool XXX(TreeNode* root, TreeNode* lower_bound = NULL, TreeNode* upper_bound = NULL) {
        if (root == NULL)
            return true;
        if (lower_bound && root->val <= lower_bound->val || 
            upper_bound && root->val >= upper_bound->val)
            return false;
        return XXX(root->left, lower_bound, root) && XXX(root->right, root, upper_bound);
    }
};

