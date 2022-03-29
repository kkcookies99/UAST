class Solution {
public:
    int XXX(TreeNode* root) {
        if (root == nullptr){
            return 0;
        }

        int leftDepth = XXX(root->left);
        int rightDepth = XXX(root->right);
        return max(leftDepth, rightDepth) + 1;
    }
};

