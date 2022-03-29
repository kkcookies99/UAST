class Solution {
public:
    int XXX(TreeNode* root) {
        if (root == nullptr) {
            return 0;
        }

        int l = XXX(root->left);
        int r = XXX(root->right);
        return max(l, r) + 1;
    }
};

