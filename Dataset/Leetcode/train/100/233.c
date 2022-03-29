 bool XXX(struct TreeNode* p, struct TreeNode* q){
    if(p && q){
        if(p->val != q->val){
            return false;
        }
        return (XXX(p->left, q->left) && XXX(p->right, q->right)) ? true : false;
    }else{
        if(p || q){
            return false;
        }else{
            return true;
        }
    }
}

