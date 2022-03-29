 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if(p == nullptr && q == nullptr)
            return true;
        if(p == nullptr || q == nullptr)
            return false;
        return (p->val == q->val && XXX(p->left, q->left) && XXX(p->right, q->right));
    }
};

