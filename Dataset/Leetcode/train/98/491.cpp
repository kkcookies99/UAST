 class Solution {
public:
    //方法一
    bool dfsInorder(TreeNode* root, long& pre)
    {
        if(!root)
            return true;
        bool left = dfsInorder(root->left, pre);
        if(pre >= root->val)
            return false;
        pre = root->val;
        bool right = dfsInorder(root->right, pre);
        return left && right;
    }
    //方法二
    bool dfs(TreeNode* root, long min, long max)
    {
        if(!root)
            return true;
        if(root->val >= max || root->val <= min)
            return false;
        
        return dfs(root->left, min, root->val) && dfs(root->right, root->val, max);
    }

    bool XXX(TreeNode* root) {

        // return dfs(root, LONG_MIN, LONG_MAX);
        long pre = LONG_MIN;
        return dfsInorder(root, pre);

    }
};

