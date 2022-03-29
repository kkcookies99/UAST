 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        return (p==nullptr&&q==nullptr)||(p!=nullptr&&q!=nullptr&&p->val==q->val&&(XXX(p->left,q->left)&&XXX(p->right,q->right)));
    }
};

