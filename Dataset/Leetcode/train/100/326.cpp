 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if(!p && !q) return true;
        if(!p || !q) return false;
        bool isp = XXX(p->left, q->left);
        bool isq = XXX(p->right, q->right);
        if(isp && isq && p->val == q->val) return true; 
        return false;
    }
};

