class Solution {
public:
    int XXX(TreeNode* root, int dep = 0) {
        if (!root) return dep;
        return  max(XXX(root->left, dep + 1), XXX(root->right, dep + 1));
    }
};

