class Solution {
public:
    int XXX(TreeNode* root) {
        if(root==nullptr) return 0;
        if(root->left==nullptr) return XXX(root->right)+1;
        if(root->right==nullptr) return XXX(root->left)+1;
        return min(XXX(root->left),XXX(root->right))+1;   
    }
};

