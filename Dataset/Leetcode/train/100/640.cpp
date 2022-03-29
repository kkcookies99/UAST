 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if(p && q && p->val == q->val) 
            return XXX(p->left, q->left) && XXX(p->right, q->right);
        if(p == NULL && q == NULL) return true;
        
        return false;
    }
};

