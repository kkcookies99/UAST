 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if(p==NULL&&q==NULL)
        return 1;
        if(p==NULL&&q!=NULL||p!=NULL&&q==NULL)
        return 0;
        if(p->val!=q->val)
        return 0;
        return XXX(p->left,q->left)&&XXX(p->right,q->right);
    }
};

