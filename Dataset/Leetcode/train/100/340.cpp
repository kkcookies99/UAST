 class Solution {
public:

    bool dfs(TreeNode* p, TreeNode* q)
    {
        if(!p && !q)
            return true;
        if((!p || !q) || p->val != q->val)
            return false;
        return dfs(p->left, q->left) && dfs(p->right, q->right);
    }

    bool XXX(TreeNode* p, TreeNode* q) {
        return dfs(p, q);
    }
};

