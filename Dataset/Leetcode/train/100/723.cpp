 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if (p == NULL || q == NULL) 
            return p == q;
        else
            return p->val==q->val && XXX(p->left, q->left) && XXX(p->right, q->right);
    }
};

