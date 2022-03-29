 bool XXX(struct TreeNode* p, struct TreeNode* q){
    if(!p&&!q)
        return true;
    if(!p&&q)
        return false;
    if(p&&!q)
        return false;
    if(p->val!=q->val)
        return false;

    return XXX(p->left,q->left)&&
    XXX(p->right,q->right);
}

