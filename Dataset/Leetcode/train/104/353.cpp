class Solution {
public:
    int XXX(TreeNode* root) {
        if(!root) return 0;
        return max(XXX(root->left)+1,XXX(root->right)+1);

    }
};

