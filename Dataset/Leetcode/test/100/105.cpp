 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if(p==NULL&&q==NULL) return true;
        if(p==NULL&&q!=NULL) return false;
        if(p!=NULL&&q==NULL) return false;
        bool left=XXX(p->left,q->left);
        bool right=XXX(p->right,q->right);
        return (p->val==q->val)&&left&&right;
    }
};