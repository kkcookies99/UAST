class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root) return true;
        if(XXX(root->left) && XXX(root->right) && abs(height(root->left)-height(root->right))<=1) return true;
        return false;
    }
    int height(TreeNode* node){
        if(!node) return 0;
        return max(height(node->left),height(node->right))+1;
    }
};

