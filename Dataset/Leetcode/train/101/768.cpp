 class Solution {
public:
    bool dfs(TreeNode* p, TreeNode* q){
        if (p == q && p != NULL) {
            return dfs(p->left, p->right);
        }
        if ((p == NULL && q != NULL) || (p != NULL && q == NULL))
            return false;
        if (p == NULL && q == NULL) 
            return true;
        if (p->val != q->val)
            return false;
        return dfs(p->left, q->right) && dfs(p->right, q->left);
    }
    bool XXX(TreeNode* root) {
        if (root == NULL) return true;
        return dfs(root, root);
    }
};

