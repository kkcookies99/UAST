 class Solution {
public:
    bool XXX(TreeNode* root) {
        return !root || helper(root->left, root->right);
    }

    bool helper(TreeNode* r1, TreeNode* r2) {
        return (!r1 && !r2)
            || ( ( r1 && r2 && r1->val == r2->val ) && helper(r1->left, r2->right) && helper(r1->right, r2->left) );
    }
};

