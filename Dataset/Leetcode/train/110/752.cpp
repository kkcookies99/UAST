 class Solution {
public:
    bool XXX(TreeNode* root) {
        return !(height(root) == -1);
    }
    int height(TreeNode* root){
        if (!root) return 0;
        int left = height(root->left);
        if (left == -1) return -1;
        int right = height(root->right);
        if (right == -1) return -1;
        if (abs(left - right) > 1) return -1;
        return max(left, right) + 1;
    }
};

