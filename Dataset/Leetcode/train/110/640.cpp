 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root==0)return true;
        if(abs(height(root->left)-height(root->right))>1)return false;
        return (XXX(root->left)&&XXX(root->right));
    }
    int height(TreeNode* root)
    {
        if(root==0)return 0;
        return 1+max(height(root->right),height(root->left));
    }
};

