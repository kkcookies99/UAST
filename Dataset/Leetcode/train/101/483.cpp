 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root==NULL)
        return true;
        return (root->left->val==root->right->val)&&XXX(root->left)&&XXX(root->right);
    }
};

