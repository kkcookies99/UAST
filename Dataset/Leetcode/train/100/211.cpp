 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if(!p && !q)
            return true;
        else if((q && !p) || (!q && p))
            return false;
        return (p->val == q->val) && XXX(p->left, q->left) && XXX(p->right, q->right);
    }
};

