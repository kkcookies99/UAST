 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if(p==nullptr) return q==nullptr;
        if(q==nullptr) return p==nullptr;
        if(p->val==q->val) return XXX(p->left,q->left)&&XXX(p->right,q->right);
        else return false;
    }
};

