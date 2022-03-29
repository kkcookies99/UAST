 class Solution {
public:
    int f = 0, ret = 1;
    void dfs(TreeNode *root, int sum)
    {
        if(root != NULL)
        {
            f += root->val;
            if(root->left==NULL && root->right==NULL && f == sum) ret = 0;
            XXX(root->left, sum);
            XXX(root->right, sum);
            f -= root->val;
        }
    }
    bool XXX(TreeNode* root, int sum) {
        dfs(root, sum);
        return ret==0;
    }
};

