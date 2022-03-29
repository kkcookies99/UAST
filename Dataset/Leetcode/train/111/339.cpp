class Solution {
public:

    int mD = INT_MAX;

    void dfs(TreeNode* root, int curD)
    {
        if(!root)
            return;
        
        if(root->left == nullptr && root->right == nullptr)
        {
            mD = min(mD, curD);
        }

        dfs(root->left, curD + 1);
        dfs(root->right, curD + 1);
    }

    int XXX(TreeNode* root) {
        if(!root)
            return 0;
        dfs(root, 1);
        return mD;
    }
};