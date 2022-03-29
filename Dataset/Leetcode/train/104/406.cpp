class Solution {
public:
    int XXX(TreeNode* root) {
        return root==nullptr?0:max(XXX(root->left)+1,XXX(root->right)+1);
    }
};

