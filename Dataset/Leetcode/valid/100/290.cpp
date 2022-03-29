 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if (!p && !q)
            return true;
        if (!p && q || p && !q)
            return false;
        bool left = XXX(p->left, q->left);
        bool right = XXX(p->right, q->right);
        return left && right && p->val == q->val;
    }
};

