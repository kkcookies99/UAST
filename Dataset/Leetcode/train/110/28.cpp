class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root == nullptr) return true;
        if(abs(depth(root->left) - depth(root->right)) > 1)
            return false;
        return XXX(root->left) && XXX(root->right);
    }
    int depth(TreeNode* root){
        if(root == nullptr) return 0;
        return 1 + max(depth(root->left), depth(root->right));
    }
};

