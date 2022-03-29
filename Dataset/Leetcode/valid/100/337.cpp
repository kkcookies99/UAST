 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if(p == nullptr && q == nullptr) return true;
        if(q == nullptr) return false;
        if(p == nullptr) return false;
        if(p->val != q->val) return false;
        if(!XXX(p->left,q->left))
            return false;
        if(!XXX(p->right,q->right))
            return false;
        return true;
    }
};

