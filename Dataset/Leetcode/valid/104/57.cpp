class Solution {
public:
    int XXX(TreeNode* root) {
        int l = 0;
        int r = 0;
        if (root == nullptr) return 0;
        else {
            l = XXX(root->left) + 1;
            r = XXX(root->right) + 1;
        }
        return l > r ? l: r;
    }
};

