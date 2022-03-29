 bool XXX(struct TreeNode* p, struct TreeNode* q){
    if(p==NULL&&q==NULL){
         return true;
    }
    else if(p!=NULL&&q!=NULL){
        if(p->val == q->val){
            return XXX(p->left,q->left)&&XXX(p->right,q->right);
        }
        return false;    
    }
    return false;
}

