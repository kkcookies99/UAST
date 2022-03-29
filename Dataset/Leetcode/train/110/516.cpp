class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root)return true;
        return abs(height(root->left)-height(root->right))<=1&&XXX(root->left)&&XXX(root->right);
    }

    int height(TreeNode*root){
        if(!root)return 0;
        return 1+max(height(root->left),height(root->right));
    }
};

