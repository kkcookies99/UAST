 bool XXX(struct TreeNode* p, struct TreeNode* q){
    if(p==NULL&&q==NULL)
        return true;
    if((p&&q)&&(p->val==q->val))
    {
        bool l=XXX(p->left,q->left);
        bool r=XXX(p->right,q->right);
        return l&&r;
    }
    return false;
}

