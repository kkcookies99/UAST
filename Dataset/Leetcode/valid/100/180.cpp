 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if (p == NULL && q == NULL) { return true; }
        else if (p != NULL && q == NULL || p == NULL && q != NULL) { return false; }
        else {
            return ((p->val == q->val) && XXX(p->left, q->left) && XXX(p->right, q->right));
        }
    }
};

