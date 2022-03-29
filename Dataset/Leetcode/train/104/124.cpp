class Solution {
public:
    int XXX(TreeNode* root) {
        return root?1+max(XXX(root->left),XXX(root->right)):0;;
    }
};

