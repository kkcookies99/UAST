 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        bool flag=issame(p,q);
        return flag;
    }
    
    bool issame(TreeNode* p, TreeNode* q){
        if(!p&&!q)
            return true;
        if(!p||!q)
            return false;
        if(p->val==q->val)
            return issame(p->left,q->left)&&issame(p->right,q->right);
        return false;
    }
};

