 class Solution {
public:
    bool f(TreeNode* l, TreeNode* r,TreeNode* ll, TreeNode* rr){
        bool a,b;
        if(!l&&!ll)
            a=true;   
        else if(!l||!ll)
            a=false;  
        else if(l->val!=ll->val)
            a=false;
        else
            a=f(l->left,l->right,ll->left,ll->right);                                                   if(!r&&!rr)
            b=true;   
        else if(!r||!rr)
            b=false;  
        else if(r->val!=rr->val)
            b=false;
        else
            b=f(r->left,r->right,rr->left,rr->right);      
        return a&&b;
    }
    bool XXX(TreeNode* p, TreeNode* q) {
        if(!p&&!q)
            return true;
        if(!p||!q)
            return false;
        if(p->val!=q->val)
            return false;
        return f(p->left,p->right,q->left,q->right);
    }
};

