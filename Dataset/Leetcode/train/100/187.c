 bool XXX(struct TreeNode* p, struct TreeNode* q){
    if(!p&&!q) return 1;
    else 
    if(p&&q && p->val==q->val){
        bool bl=XXX(p->left,q->left),
        br=XXX(p->right,q->right);
        return bl&&br?1:0;
    }
    return 0;
}

