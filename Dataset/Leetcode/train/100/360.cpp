 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if (p && !q || !p && q) return false;
        if (!p && !q) return true;
        return (p->val == q->val) && XXX(p->left, q->left) && XXX(p->right, q->right); 
    }
};

