class Solution {
public:
    int XXX(TreeNode* root) {
        if(!root)return 0;
        if(!root->left&&!root->right)return 1;
        if(!root->left||!root->right)return max(XXX(root->left),XXX(root->right))+1;
        return min(XXX(root->left),XXX(root->right))+1;
    }
};

