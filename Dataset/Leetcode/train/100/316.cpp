 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if (p == nullptr) return q == nullptr;
        if (q == nullptr) return p == nullptr;
        return (p->val == q->val) && XXX(p->left, q->left) && XXX(p->right, q->right);
    }
};

