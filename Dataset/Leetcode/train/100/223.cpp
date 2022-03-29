 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if(p==nullptr&&q==nullptr)
            return true;
        else if(p==nullptr||q==nullptr)
            return false;
        else
            return p->val==q->val&&XXX(p->left,q->left)&&XXX(p->right,q->right);
    }
};

