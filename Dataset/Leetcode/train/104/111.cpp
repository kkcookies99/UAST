class Solution {
public:
    int XXX(TreeNode* root) {
        return root ? max(XXX(root->left), XXX(root->right)) + 1 : 0;
    }
};

