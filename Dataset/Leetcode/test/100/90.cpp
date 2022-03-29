 class Solution {
public:
    bool flag=true;
    bool XXX(TreeNode* p, TreeNode* q) {
        reverse(p,q);
        return flag;
    }
    void reverse(TreeNode* p,TreeNode* q){
        if(p==nullptr&&q==nullptr) return ;
        if(p==nullptr||q==nullptr||p->val!=q->val){ flag=false; return ;}

        reverse(p->left,q->left);
        reverse(p->right,q->right);
    }
};

