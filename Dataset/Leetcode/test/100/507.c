 bool XXX(struct TreeNode* p, struct TreeNode* q){
    if (NULL == p && NULL == q) return true;
    if (NULL == p || NULL == q) return false;
    return p->val == q->val && 
           XXX(p->left, q->left) && 
           XXX(p->right, q->right);
}

