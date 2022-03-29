 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root || (!root->left && !root->right))
            return true;
        if(!root->left)
            return (getMin(root->right) > root->val) && XXX(root->right);
        else if(!root->right)
            return (getMax(root->left) < root->val) && XXX(root->left);
        else 
            return (getMin(root->right) > root->val && getMax(root->left) < root->val) && XXX(root->left) && XXX(root->right);
    }

    int getMin(TreeNode *node) {
        if(!node->left)
            return node->val;
        return getMin(node->left);
    }

    int getMax(TreeNode *node) {
        if(!node->right)
            return node->val;
        return getMax(node->right);
    }
};

