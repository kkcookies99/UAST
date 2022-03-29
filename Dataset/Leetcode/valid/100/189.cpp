 class Solution {
public:
    bool dfs(TreeNode*p, TreeNode *q) {
        if (!p && !q) {
            return true;
        } else if (!p || !q) {
            return false;
        } else if (p->val == q->val) {
            return dfs(p->left, q->left) && dfs(p->right, q->right);
        } else {
            return false;
        }
    }

    bool XXX(TreeNode* p, TreeNode* q) {
        return dfs(p, q);
    }
};

