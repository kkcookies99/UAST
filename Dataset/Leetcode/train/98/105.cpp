 class Solution {
public:
    bool dfs(TreeNode* root)
    {
        if(root==NULL)return true;
        if(root->right)
        {
            if(root->val>=root->right->val)return false;
            if(root->right->left)
            {
                if(root->val>=root->right->left->val)return false;
            }
        }
        if(root->left)
        {
            if(root->val<=root->left->val)return false;
            if(root->left->right)
            {
                if(root->val<=root->left->right->val)return false;
            }
        }
        return dfs(root->left)&&dfs(root->right);
    }

    bool XXX(TreeNode* root) {
        // 1. 根小于左节点  2 . 根大于右节点
     return dfs(root);
    }
};

