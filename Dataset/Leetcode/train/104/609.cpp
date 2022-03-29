 class Solution {
public:
    int XXX(TreeNode* root) {
        if (NULL == root) return 0;
        int left = XXX(root->left);
        int right = XXX(root->right);
        int depth = ((left > right) ? left : right);
        return depth + 1;
    }
};

