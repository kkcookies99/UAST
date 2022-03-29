 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(root == nullptr)     return false;
        if(sum == root->val and root->left == nullptr and root->right == nullptr)    return true;
        return XXX(root->left,sum-root->val) or XXX(root->right,sum-root->val);
    }
};

