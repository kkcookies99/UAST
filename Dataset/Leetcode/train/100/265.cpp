 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if(!p && !q) return true;
        if(!p || !q) return false;
        if(p->val!=q->val) return false;
        bool left = XXX(p->left,q->left);
        bool right = XXX(p->right,q->right);
        return left && right;
    }
};

