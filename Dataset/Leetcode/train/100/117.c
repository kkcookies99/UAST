 bool XXX(struct TreeNode* p, struct TreeNode* q){
    return (p == NULL && q == NULL) || (p != NULL && q != NULL && p->val == q->val && XXX(p->left, q->left) && XXX(p->right, q->right));
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


