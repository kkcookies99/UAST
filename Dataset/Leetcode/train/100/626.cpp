 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        return p ? (q ? p->val == q ->val && XXX(p->left, q->left) && XXX(p->right, q->right) : false) : q ? false : true;
    }
};

