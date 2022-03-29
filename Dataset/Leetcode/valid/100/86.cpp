 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if(p==NULL&&q==NULL){
            return true;
        }
        bool x=xianxv(p,q);
        return x;
    }
    bool xianxv(TreeNode *p,TreeNode *q){
        if(p!=NULL&&q!=NULL){
            if(p->val!=q->val){
                return 0;
            }
            return xianxv(p->left,q->left)&&xianxv(p->right,q->right);
        }
        if(p==NULL&&q==NULL){
            return 1;
        }
        return 0;
    }
};

