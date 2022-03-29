 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if(!q && !p)
            return true;
        if(!q || !p)
            return false;
        return q->val==p->val&&XXX(p->left,q->left)&&XXX(p->right,q->right);
    }
};

