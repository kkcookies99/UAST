 class Solution {
public:
    bool dfs(TreeNode* root, int &depth)
    {
        if(!root)
        {
            depth=0;
            return true;
        }
        int left=0, right=0;
        if(dfs(root->left, left)&&dfs(root->right, right))
        {
            if(abs(left-right)<=1)
            {
                depth=max(left, right)+1;
                return true;
            }
        }
        return false;
    }
    bool XXX(TreeNode* root) {
        int depth=0;
        return dfs(root, depth);
    }
};

