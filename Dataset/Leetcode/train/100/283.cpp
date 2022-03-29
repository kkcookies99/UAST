 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if(!p && !q)return true;
        else if(!p || !q || p->val != q->val) return false;
        else return XXX(p->left,q->left) && XXX(p->right,q->right);
    }
};

