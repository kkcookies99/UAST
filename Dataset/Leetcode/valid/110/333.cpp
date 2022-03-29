class Solution {
public:

    int treeheight(TreeNode* root)
    {
        if(root == nullptr)
            return 0;
        
        return  max(treeheight(root->right), treeheight(root->left)) + 1;
    }

    bool dfs(TreeNode* root)
    {
        if(!root)
            return true;
        
        return abs(treeheight(root->left) - treeheight(root->right)) <= 1 && dfs(root->right) && dfs(root->left);
    }

    bool XXX(TreeNode* root) {
        return dfs(root);
    }
};

