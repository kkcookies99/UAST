 class Solution {
public:
    bool check(TreeNode *p,TreeNode *q,int &flag){
        if(!p&&!q)  return 1;
        else if(!p||!q) {flag=0;return 0;}
        else if(p->val!=q->val) {flag=0;return 0;}
       if(flag)
        return check(p->left,q->right,flag)&&check(p->right,q->left,flag);
        else return 0;
    }
    bool XXX(TreeNode* root) {
        int flag=1;
        if(root==NULL)  return 1;
        else return check(root->left,root->right,flag);
    }
};

