 bool XXX(struct TreeNode* p, struct TreeNode* q){
if(p==NULL&&q==NULL) return true;
if(p==NULL||q==NULL) return false;
if(p->val!=q->val) return false;
return XXX(p->left,q->left)&&XXX(p->right,q->right);
}

