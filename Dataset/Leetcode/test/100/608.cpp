 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if(p==NULL&&q==NULL)
            return true;
        if(p==NULL||q==NULL||p->val!=q->val)
            return false;
        return XXX(p->left,q->left)&&XXX(p->right,q->right);
    }
};

