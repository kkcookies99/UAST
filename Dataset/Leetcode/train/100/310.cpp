 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if(p==nullptr && q==nullptr)return true;
        if(p==nullptr || q==nullptr)return false;
        if(p->val==q->val){
            return XXX(p->left,q->left)&& XXX(p->right,q->right);
        }
        return false;
    }
};

