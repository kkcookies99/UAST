 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if(!p && !q)return true;
        if(!p || !q)return false;
        if(p->val!=q->val)return false;
        return XXX(p->right,q->right) && XXX(p->left,q->left);
    }
};

