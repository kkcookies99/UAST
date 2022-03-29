class Solution {
public:
    int XXX(TreeNode* root) {
        if(root == nullptr)
            return 0;
        if (!root->left && !root->right)
            return 1;
        int left = INT_MAX, right = INT_MAX;
        if (root->left)
            left = XXX(root->left);
        if (root->right)
            right = XXX(root->right);
        return min(left, right)+1;
    }
};

