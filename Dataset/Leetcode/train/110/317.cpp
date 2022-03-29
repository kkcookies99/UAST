class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root)   return true;
        return XXX(root->left) && XXX(root->right) && abs(height(root->left) - height(root->right)) <= 1;
    }

    int height(TreeNode* root){
        if(!root)   return 0;
        return max(height(root->left), height(root->right)) + 1;
    }
};

