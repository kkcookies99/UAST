 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if(p == nullptr || q == nullptr) return p == q;
        return (p->val != q->val)? false : XXX(p->left, q->left) && XXX(p->right, q->right);
    }
};

