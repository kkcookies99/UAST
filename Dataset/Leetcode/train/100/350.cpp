 class Solution {
public:

    bool XXX(TreeNode* p, TreeNode* q) {
        if ((p == nullptr) ^ (q == nullptr)) {
            return false;
        } else if ((p != nullptr) && (q != nullptr)) {
            if (p->val != q->val) {
                return false;
            }
            return XXX(p->left, q->left) & XXX(p->right, q->right);
        }
        
        return true;
    }
};

