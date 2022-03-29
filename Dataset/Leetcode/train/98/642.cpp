 class Solution {
public:
    bool XXX(TreeNode* root) {
        return XXX(root, INT64_MIN, INT64_MAX);
    }

    bool  XXX(TreeNode * root, long int minvalue, long int maxvalue)
    {
        return root == NULL || ((root->val > minvalue && root->val < maxvalue) && XXX(root->left, minvalue, root->val) && XXX(root->right, root->val, maxvalue));
    }
};

