class Solution {
public:
    int deep(TreeNode* root){
        if(!root)   return 0;
        return max(deep(root->left),deep(root->right))+1;
    }
    bool XXX(TreeNode* root) {
        if(!root)    return true;
        if(abs(deep(root->left) - deep(root->right)) > 1)    return false;
        return XXX(root->left) && XXX(root->right);
    }

};

