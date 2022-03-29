 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(root == NULL) return false;
        if(root->left == NULL && root->right == NULL) return !(sum - root->val);
        return XXX(root->left, sum-root->val) || XXX(root->right, sum-root->val);
    }
};

