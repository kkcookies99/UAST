class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root==nullptr)
            return true;
        if(abs(depth(root->right)-depth(root->left))>1)
            return false;
        
        return XXX(root->right)&&XXX(root->left);
        
    }
    int depth(TreeNode* root)
    {
        return root==nullptr?0:max(depth(root->right),depth(root->left))+1;
    }
};

