 bool XXX(struct TreeNode* p, struct TreeNode* q){
if(p&&!q||!p&&q)return false;
if(!q&&!p)return true;    
if(p&&q&&p->val!=q->val)return false;
if(!XXX(p->left,q->left))return false;
if(!XXX(p->right,q->right))return false;
return true;
}

