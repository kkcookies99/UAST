 class Solution {
public:
    bool dfs(TreeNode* p, TreeNode* q)
    {
        if(!p && !q) return true;
        if(!p || !q || p->val != q->val) return false;
        return dfs(p->left, q->right)&&dfs(p->right, q->left);
    }
    bool XXX(TreeNode* root) {
        return dfs(root->left, root->right);
    }
};

