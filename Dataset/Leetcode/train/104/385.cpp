class Solution {
public:
    int XXX(TreeNode* root) {
        if(root==NULL)
            return 0;
        return XXX(root->left)<XXX(root->right)?XXX(root->right)+1:XXX(root->left)+1;
    }
};

