class Solution {
public:
    int XXX(TreeNode* root) {
        return dfs(root);
    }

    int dfs(TreeNode *root)
    {
        if(root==NULL)
            return 0;
        int left = dfs(root->left);
        int right = dfs(root->right);
        return max(left,right)+1;
    }
};

