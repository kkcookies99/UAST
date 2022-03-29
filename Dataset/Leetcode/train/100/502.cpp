 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if(p==NULL && q==NULL ) return true;
        if(p==NULL || q==NULL) return false;
        if(p->val!=q->val) return false;
        if(XXX(p->left,q->left) && XXX(p->right,q->right)) return true;
        else return false;
    }
};

