 bool XXX(struct TreeNode* p, struct TreeNode* q){
    if( p == NULL || q == NULL) return p == q;
    if( p->val != q->val ) return 0;
    return XXX(p->left,q->left) && XXX(p->right,q->right);
}

