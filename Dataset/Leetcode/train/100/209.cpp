 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
         if(p==nullptr && q==nullptr) return true;
         //不相同的情况
         if(p==nullptr || q==nullptr || p->val != q->val) return false;
         return XXX(p->left,q->left) && XXX(p->right,q->right);
    }
};

