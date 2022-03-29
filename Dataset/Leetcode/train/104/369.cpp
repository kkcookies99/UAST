class Solution {
public:
    int XXX(TreeNode* root) {
        if (root == nullptr) return 0; 
        return 1 + (XXX(root->left) > XXX(root->right) ? XXX(root->left) : XXX(root->right));
        }
};

