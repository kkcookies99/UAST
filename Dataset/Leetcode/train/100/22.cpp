 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        try{
            preOrderVerify(p,q);
        }catch(...){
            return false;
        }
        return true;
    }
    void preOrderVerify(TreeNode* p,TreeNode* q){
        if(p==nullptr&&q==nullptr)return;
        //1.是否拥有左右子树，状态不同就抛出false
        if(p==nullptr||q==nullptr||p->left==nullptr^q->left==nullptr||p->right==nullptr^q->right==nullptr||p->val!=q->val){
            throw exception();
        }
        if(p->left)preOrderVerify(p->left,q->left);
        if(p->right)preOrderVerify(p->right,q->right);
    }
};

